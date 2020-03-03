package com.qa.daytwo.iteration

object It {
  def main(args: Array[String]): Unit = {
    println(iter("hi"))// outputs "hi \n  hi \n hi \n hi
    println(iter2("hello",4)) //outputs "hellohellohellohello\n" * 4
  }
  def iter(a:String): String ={
    (a+"\n")*a.length
  }
  def iter2(a:String,b:Int): String ={
    ((a*b)+"\n")*b
  }

}
