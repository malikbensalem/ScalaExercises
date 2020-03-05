package com.qa.daythree.battle

import scala.io.StdIn
import scala.util.Random

class AI extends Person {
  placeShip
  override def placeShip: Unit = {
    super.placeShip
    for (ship: Int <- ships) {
      randomChoice()
      myBoard(y)(x)="#"
    }
  }
  override def drawBoard: Unit ={
    for (vert <-myBoard){
      for (hor<-vert){
        if (hor=="#"){print(". ")}
        else{print(hor+" ")}
      }
      println()
    }
    println("_"*myBoard.length*2)
  }


  def whichWay(ship:Int): Unit ={
    if (Random.nextInt(1)==1){
      for (i<-0 until ship){
        myBoard(y)(x+i)="#"
      }
    }else{
      for (i<-0 until ship){
        myBoard(y+i)(x)="#"
      }
    }
  }




  def randomChoice(shipSize:Int=0): Unit = {
    var valid = false
    while (!valid) {
      y = Random.nextInt(opBoard.length)
      x = Random.nextInt(opBoard(0).length)
      if (validate(y, x, shipSize)) {
        println("Successful")
        valid = true
      }
    }
  }
  override def inputMove: Unit = {
    super.inputMove
    randomChoice()
    opBoard(y)(x)="X"
  }

}
