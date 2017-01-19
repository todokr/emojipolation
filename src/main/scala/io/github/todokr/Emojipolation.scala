package io.github.todokr

import com.vdurmont.emoji.EmojiParser

object Emojipolation {

  implicit class EmojipolationImpl(sc: StringContext) {

    def emoji(args: Any*): String = {
      EmojiParser.parseToUnicode(sc.parts.mkString)
    }
  }
}
