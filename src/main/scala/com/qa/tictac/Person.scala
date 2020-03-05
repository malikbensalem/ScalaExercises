package com.qa.tictac

abstract class Person() {
  var symbol =""

  def this(sym:Char){
    symbol=sym
  }
  def makeMove: Unit ={}


}
