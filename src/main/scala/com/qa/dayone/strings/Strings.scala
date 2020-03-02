package com.qa.dayone.strings

object Strings {
  def main(args: Array[String]): Unit = {
    println(length("hello",3))
  }
  def length(a:String,b:Int) ={
    a.substring(b-1)
  }
}
