package com.qa.dayone.strings

object Strings {
  def main(args: Array[String]): Unit = {
    println(length("hello",3))
    println(combine("ha","llo",'a','e'))
  }
  def length(a:String,b:Int) ={
    a.substring(b-1)
  }
  def combine(a:String,b:String,c:Char,d:Char): String ={
    var word = ""
    for (i<-a+b){
      if (i==c){
        word+=d
      }else{
        word+=i
      }
    }
    word
  }
}
