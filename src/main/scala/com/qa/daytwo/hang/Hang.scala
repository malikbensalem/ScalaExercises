package com.qa.daytwo.hang

import scala.io.Source

object Hang {
  var life=0
  def main(args: Array[String]): Unit = {
    play()
  }
  def play(): Unit ={
    life=5

  }
  def drawHang(): Unit ={ //idk how to draw hangman
    println("life: "+life)
  }
  def genWord(): Unit ={
 //   Source.fromFile("dict.txt").getLines.toList()
  }
  def input(): Unit ={

  }

}
