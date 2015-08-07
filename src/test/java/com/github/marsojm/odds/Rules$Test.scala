package com.github.marsojm.odds

import org.scalatest.FunSuite


class Rules$Test extends FunSuite {

  test("testThreeOfAKind with valid three of a kind in hand") {
    val hand = List(
      new Card(Ace(),Clubs()),
      new Card(Ace(),Hearts()),
      new Card(Seven(),Spades()),
      new Card(Ace(),Diamonds()),
      new Card(Jack(),Clubs()))

    assert(Rules.threeOfAKind(hand))
  }

  test("testThreeOfAKind with invalid three of a kind in hand") {
    val hand = List(
      new Card(King(),Clubs()),
      new Card(Ace(),Hearts()),
      new Card(Seven(),Spades()),
      new Card(Ace(),Diamonds()),
      new Card(Jack(),Clubs()))

    assert(!Rules.threeOfAKind(hand))
  }

  test("testPair with valid pair in hand") {
    val hand = List(
      new Card(Two(),Clubs()),
      new Card(Ace(),Hearts()),
      new Card(Seven(),Spades()),
      new Card(Ace(),Diamonds()),
      new Card(Jack(),Clubs()))

    assert(Rules.pair(hand))
  }


  test("testPair with invalid pair in hand") {
    val hand = List(
      new Card(Two(),Clubs()),
      new Card(Ace(),Hearts()),
      new Card(Seven(),Spades()),
      new Card(Queen(),Diamonds()),
      new Card(Jack(),Clubs()))

    assert(!Rules.pair(hand))
  }
}
