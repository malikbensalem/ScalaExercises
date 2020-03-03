package com.qa.dayone.beer

object BeerO {
  def main(args: Array[String]): Unit = {
    beer(5)
  }
  def beer(a: Int): Unit ={
    (a to 1 by -1).toList.foreach(elem => println(elem + "bottles of beer"))
    println("No beer")
//    println(((b-=1)+""+b+" bottles of beer\n")*a) //My funky way (which doesn't fully work ;( )
  }
}
