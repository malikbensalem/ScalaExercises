package com.qa.daytwo.iteration

object It {
  def main(args: Array[String]): Unit = {
    println(iter("hi"))// outputs "hi \n  hi \n hi \n hi"
    println(iter2("hello",4)) //outputs "hellohellohellohello\n" * 4
    println(fizzbuzz("a","b",3))//outputs 12a
  }
  def iter(a:String): String ={
    (a+"\n")*a.length
  }
  def iter2(a:String,b:Int): String ={
    ((a*b)+"\n")*b
  }
  def fizzbuzz(a:String,b:String,c:Int)={
    var s=""
    for (i<-1 to c) {
      if (i % 3 == 0 || i % 5 == 0) {
        if (i % 3 == 0) {
          s += a
        }

        if (i % 5 == 0) {
          s += b
        }
      }
      else{s+=i}
    }
    s
  }

}
