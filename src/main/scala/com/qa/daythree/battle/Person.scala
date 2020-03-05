package com.qa.daythree.battle

abstract class Person {
  var opBoard=Array.ofDim[String](12,12)
  var x=0;var y=0
  var myBoard=Array.ofDim[String](12,12)
  var ships=Array(2,2,3,3,3,4,5)
  resetBoard


  def setOpBoard(enBoard:Array[Array[String]]): Unit ={
    opBoard=enBoard
  }
  def resetBoard: Unit ={
    myBoard=Array(
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."),
      Array(".",".",".",".",".",".",".",".",".",".",".","."))
  }
  def placeShip: Unit ={}
  def inputMove: Unit ={}

  def doMove: Unit ={}
  def validate(y:Int,x:Int,shipLen:Int=0): Boolean ={

    if(myBoard(0).length-shipLen>y&&myBoard.length-shipLen>x){
      myBoard(y)(x).equals(".")
    }else{false}
  }

  def drawBoard: Unit ={}
  def hitSelf(y:Int, x:Int): Unit ={
    myBoard(y)(x)="X"
  }
  def lose: Boolean  = {
    for (line <-myBoard) {
      if (!line.contains("#")) {
        true
      }
    }
    false
  }
}
