package com.qa.daythree.pat

object Pat {
  def main(args: Array[String]): Unit = {
    patternMatch(Array(1,2))//outputs (2,1)
    patternMatch(1,2)//outputs 2,1
    patternMatch(List(1,2))//outputs List(2,1)

  }
  def patternMatch(input :Any) = input match{
    case input @ List(_,_) => println(input.reverse)
    case input @ (_,_) => println(input.swap)
    case input @ Array(_,_) => println(input(1) + "," + input(0))
    case _ => println("failed")
  }
}
