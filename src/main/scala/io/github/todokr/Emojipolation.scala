package io.github.todokr

import scala.language.experimental.macros
import scala.reflect.macros.blackbox

import com.vdurmont.emoji.EmojiParser

object Emojipolation {

  implicit class EmojipolationImpl(val sc: StringContext) extends AnyVal {
    def emoji(args: Any*): String = macro impl
  }

  def impl(c: blackbox.Context)(args: c.Expr[Any]*): c.Expr[String] = {
    import c.universe._

    c.prefix.tree match {
      case Apply(_,List(Apply(_,List(Literal(Constant(s: String)))))) =>
        c.Expr[String](q"${EmojiParser.parseToUnicode(s)}")
      case _ => c.abort(c.enclosingPosition, "Oops!")
    }
  }
}


