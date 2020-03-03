package com.qa.dayone.beer

object BeerO {
  def main(args: Array[String]): Unit = {
    beer(5)
  }
  def beer(a: Int): Unit ={
  for (a<-a until 0 by-1){
    println(a+" bottles of beer")
  }
    println("no beer")
  }
}
