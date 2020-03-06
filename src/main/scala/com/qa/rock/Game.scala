package com.qa.rock

import scala.collection.mutable

class Game {
  var player=new Player()
  var ai=new AI()
  var syms=mutable.Map("rock"->"scissors","paper"->"rock","scissors"->"paper")

  def checkWin: String ={
    if (syms[player.currentSymbol]==ai.currentSymbol){
      println(players(i).currentSymbol.name+" wins")
      true
    }
  }

}
