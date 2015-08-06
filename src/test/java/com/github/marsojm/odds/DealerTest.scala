package com.github.marsojm.odds

import org.scalatest.FunSuite

class DealerTest extends FunSuite {

  test("testMakeDeck generates right amount of cards") {
    val dealer = new Dealer
    val deck = dealer.makeDeck()
    assert(deck.cards.length == 52)
  }

  test("testDealCard works correctly") {
    val dealer = new Dealer
    val deck = dealer.makeDeck()
    val (card, newDeck) = dealer.dealCard(deck)
    System.out.println(card)
    System.out.println("")

    newDeck.cards.foreach(c => System.out.println(c))

    assert(newDeck.cards.length == 51)
    assert(newDeck.cards.forall(c => c != card))
  }

}
