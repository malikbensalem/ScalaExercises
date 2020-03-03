package com.qa.daytwo.conditionals

object Con {
  def main(args: Array[String]): Unit = {
    println(co(2,5,true)) //outputs 7
    println(co(2,5,false)) //outputs 10
  }
  def co(a:Int,b:Int,c:Boolean): Int ={
    if (c){a+b}
    else{a*b}
  }
}
