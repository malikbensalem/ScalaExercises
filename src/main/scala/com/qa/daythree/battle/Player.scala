package com.qa.daythree.battle

import scala.io.StdIn

class Player extends Person {
  placeShip
  override def placeShip: Unit = {
    super.placeShip
    for (ship: Int <- ships) {
      getInput(ship)
      whichWay(ship)

    }
  }

  override def drawBoard: Unit ={
    for (vert <-myBoard){
      for (hor<-vert){
        print(hor+" ")
      }
      println()
    }
    println("_"*myBoard.length*2)
  }


  def whichWay(ship:Int): Unit ={
    println("Orientation: (H/V)")
    if (StdIn.readLine().toLowerCase()=="h"){
      for (i<-0 until ship){
        myBoard(y)(x+i)="#"
      }
    }else{
      for (i<-0 until ship){
        myBoard(y+i)(x)="#"
      }
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
        println("Successful")
        valid = true
      }
    }
  }
}
