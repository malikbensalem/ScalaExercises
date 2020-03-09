package com.qa.rock

import scala.io.StdIn

class Player extends Person {

  override def inputMove: Unit = {
    currentSymbol=StdIn.readLine("rock, paper, scissors: ").toLowerCase()
  }
}
