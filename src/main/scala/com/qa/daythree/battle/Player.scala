package com.qa.daythree.battle

import scala.io.StdIn

class Player extends Person {
  override def placeShip: Unit = {
    super.placeShip
    for (ship: Int <- ships) {
      getInput(ship)
      myBoard(y)(x)="#"
    }
  }

  override def inputMove: Unit = {
    super.inputMove
    getInput()
    opBoard(y)(x)="X"
  }

  def getInput(shipSize: Int=0): Unit = {
    var valid = false
    while (!valid) {
      println("Y: ")
      y = StdIn.readInt()
      println("X: ")
      x = StdIn.readInt()
      if (validate(y, x, shipSize)) {
        valid = true
      }
    }
  }
}
