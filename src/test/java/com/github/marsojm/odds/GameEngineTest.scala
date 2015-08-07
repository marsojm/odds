package com.github.marsojm.odds

import org.scalatest.FunSuite

class GameEngineTest extends FunSuite {

  test("testDealHandCards") {
    val dealer = new Dealer
    val deck = dealer.makeDeck()
    val players = List(new Player(None), new Player(None), new Player(None))
    val engine = new GameEngine
    val (playersWithCards, newDeck) = engine.dealHandCards(dealer, players, deck)

    assert(playersWithCards.forall(p => p.handCards != None))
    assert(newDeck.cards.length == 52 - playersWithCards.length * 2)
  }

}
