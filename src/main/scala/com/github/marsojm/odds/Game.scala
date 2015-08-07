package com.github.marsojm.odds



class GameEngine {
  private def dealPairOfCards(dealer:Dealer,deck:Deck, player:Player) = {
    val (c1, d1) = dealer.dealCard(deck)
    val (c2, d2) = dealer.dealCard(d1)
    val p = new Player(Some((c1,c2)))
    (p,d2)
  }

  def dealHandCards(dealer:Dealer, ps:List[Player], d:Deck) : (List[Player], Deck) = {
    def f(acc:List[Player], players:List[Player], deck:Deck) : (List[Player], Deck) = players match {
      case p::ps => {
        val (player,newDeck) = dealPairOfCards(dealer, deck, p)
        f(player::acc, ps, newDeck)
      }
      case _ => (acc, deck)
    }
    f(List(), ps, d)
  }
}

class GameState(val players: List[Player],val board: Board, val deck:Deck)
class Player(val handCards:Option[(Card,Card)])
class Board(val cards:Option[List[Card]])