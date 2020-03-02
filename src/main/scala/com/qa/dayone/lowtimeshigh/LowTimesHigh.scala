package com.qa.dayone.lowtimeshigh

object LowTimesHigh {
  def main(args: Array[String]): Unit = {
    println(lowHigh(2,7,4))
  }
  def lowHigh(a:Int,b:Int,c:Int): Int ={

    (Math.min(Math.min(a,b),Math.min(a,c))+ Math.max(Math.max(Math.min(a,b),Math.min(a,c)),Math.max(Math.min(b,c),Math.min(b,a)))) * Math.max(Math.max(a,b),Math.max(a,c))
  }
}
