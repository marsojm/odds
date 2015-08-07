package com.github.marsojm.odds

import scala.util.Random

class Dealer {
  private val ranks = List(Ace(), Two(), Three(), Four(), Five(), Six(), Seven(), Eight(), Nine(), Ten(), Jack(), Queen(), King())
  private val suits = List(Hearts(), Diamonds(), Spades(), Clubs())

  def makeDeck(): Deck = {
    val cards : List[Card] =
      for (r <- ranks; s <- suits ) yield new Card(r, s)

    new Deck(cards)
  }

  def dealCard(deck:Deck) : (Card,Deck) = {
    val random = new Random
    val card = deck.cards(random.nextInt(deck.cards.length))
    val cards = deck.cards.filterNot(c => c == card)
    (card, new Deck(cards))
  }
}




