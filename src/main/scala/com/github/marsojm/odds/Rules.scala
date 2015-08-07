package com.github.marsojm.odds

object Rules {
  def threeOfAKind(cards: List[Card]): Boolean = {
    val groups = cards.groupBy( c => c.rank )

    !groups.forall( item => item._2.length < 3)
  }

  def pair(cards: List[Card]): Boolean = {
    val groups = cards.groupBy( c => c.rank )
    !groups.forall( item => item._2.length < 2)
  }

}

