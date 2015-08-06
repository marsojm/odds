package com.github.marsojm.odds


sealed trait Rank
case class Ace() extends Rank
case class Two() extends Rank
case class Three() extends Rank
case class Four() extends Rank
case class Five() extends Rank
case class Six() extends Rank
case class Seven() extends Rank
case class Eight() extends Rank
case class Nine() extends Rank
case class Ten() extends Rank
case class Jack() extends Rank
case class Queen() extends Rank
case class King() extends Rank

sealed trait Suit
case class Hearts() extends Suit
case class Diamonds() extends Suit
case class Clubs() extends Suit
case class Spades() extends Suit

class Card(r: Rank, s: Suit) {
  val rank = r
  val suit = s

  override def equals(o: Any) = o match {
    case that: Card => this.rank == that.rank && this.suit == that.suit
    case _ => false
  }

  override def toString() : String = {
    s"${this.rank.getClass.getSimpleName} of ${this.suit.getClass.getSimpleName}"
  }
}

class Deck(cs:List[Card]){
  val cards = cs
}





