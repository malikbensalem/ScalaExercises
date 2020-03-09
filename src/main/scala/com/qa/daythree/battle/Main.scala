package com.qa.daythree.battle

object Main {
  def main(args: Array[String]): Unit = {
    var ai=new AI
    var player=new Player
    var play = true
    ai.setOpBoard(player.myBoard)
    player.setOpBoard(ai.myBoard)
    println("play")
    while (play){
      println("Player Board:")
      player.drawBoard
      println("\n\n\n\n\n\n\n\nAI Board:")
      ai.drawBoard
      player.inputMove
      ai.inputMove
      if (ai.lose){
        println("You Win!")
        play=false
      }else if(player.lose){
        println("AI Wins!")
        play=false
      }
    }
  }
}
