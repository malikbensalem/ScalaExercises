package com.qa.rock

import scala.collection.mutable
import scala.io.StdIn

class Game {
  val player=new Player()
  val ai=new AI()
  val syms=mutable.Map("rock"->"scissors","paper"->"rock","scissors"->"paper")
  val sms=mutable.Map("rock"->"paper","paper"->"scissors","scissors"->"rock")
  def checkWin: Boolean ={
    println(player.currentSymbol+" vs "+ai.currentSymbol)
    ai.learner(sms(player.currentSymbol))+=1
    if (syms(player.currentSymbol)==ai.currentSymbol){
      player.score+=1
      println("player wins!")
      true
    }else if (syms(ai.currentSymbol)==player.currentSymbol){
      ai.score+=1
      println("AI wins!")
      true
    }
    false
  }
  def play: Unit ={
    var yeet="y"
    while (yeet!="n") {
      player.inputMove
      ai.inputMove
      checkWin
      yeet=StdIn.readLine("Do you want to play again? (Y/N)\n").toLowerCase()

    }

  }

}
