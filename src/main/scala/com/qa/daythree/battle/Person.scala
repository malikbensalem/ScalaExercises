package com.qa.daythree.battle

abstract class Person {
  var opBoard=Array.ofDim[String](12,12)
  var x=0;var y=0
  var myBoard=Array.ofDim[String](12,12)
  var ships=Array(2,2,3,3,3,4,5)

  def setOpBoard(enBoard:Array[Array[String]]): Unit ={
    opBoard=enBoard
  }
  def resetBoard: Unit ={
    var myBoard=Array(
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
    println(myBoard)
   // myBoard(0)(0)="s";myBoard(0)(1)="s"
  }
  def placeShip: Unit ={}
  def inputMove: Unit ={}

  def doMove: Unit ={}
  def validate(y:Int,x:Int,shipLen:Int=0): Boolean ={
    myBoard(0).length<y-shipLen&&myBoard.length<x-shipLen
  }

  def drawBoard: Unit ={
    myBoard.foreach(el=>el.foreach(e=>print(e)))
  }
  def hitSelf(y:Int, x:Int): Unit ={
    myBoard(y)(x)="X"
  }
  def lose: Unit = {
    if (!myBoard.canEqual("@")){
      true
    }else{false}
  }

}
