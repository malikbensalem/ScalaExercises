package com.qa.tictac

class Board {
  var mainBoard=Array.ofDim(3,3)


  def printBoard: Unit ={
    println(" _ "*mainBoard.length)
    for (line<-mainBoard){
      for (el<-line){
        print("|"+el+"|")
      }
      println()
      println(" _ "*mainBoard.length)
    }
  }
  def resetBoard: Unit ={
    mainBoard=Array(
      Array(" "," "," "),
      Array(" "," "," "),
      Array(" "," "," "))
  }
  def win(sym:Char): Boolean ={
    for (i<-0 until mainBoard.length){
      for (j<-0 until mainBoard(i).length){
        if (j+3< mainBoard(i).length){
          if (sym==mainBoard(i)(j)&&sym==mainBoard(i)(j+1)&&sym==mainBoard(i)(j+2)){true}
          if (i+3<mainBoard.length&&j<0){
            if (sym==mainBoard(i)(j)&&sym==mainBoard(i+1)(j-1)&&sym==mainBoard(i+2)(j-2)){true}
          }
        }
        if (i+3<mainBoard.length){
          if (sym==mainBoard(i)(j)&&sym==mainBoard(i+1)(j)&&sym==mainBoard(i+2)(j)){true}
          if(j+3<mainBoard.length){
            if (sym==mainBoard(i)(j)&&sym==mainBoard(i+1)(j+1)&&sym==mainBoard(i+2)(j+2)){true}
          }
        }
      }
    }
    false
  }
  def validMove(y:Int,x:Int): Unit ={

  }
}
