package com.qa.daythree.battle

class AI extends Person {
  override def placeShip: Unit = {
    super.placeShip
    for (ship: Int <- ships) {

      myBoard(y)(x)="#"
    }
  }

  override def inputMove: Unit = {
    super.inputMove

    opBoard(y)(x)="X"
  }

}
