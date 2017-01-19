package io.github.todokr

import org.scalatest.FunSuite

import Emojipolation._

class EmojipolationSpec extends FunSuite {

  test("Emoji interpolation interpolates Emoji") {
    assert(emoji"(OMG}:innocent: :boom: :gun: :cop:" == "(OMG}\uD83D\uDE07 \uD83D\uDCA5 \uD83D\uDD2B \uD83D\uDC6E")
  }
}
