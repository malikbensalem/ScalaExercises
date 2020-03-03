package com.qa.daytwo.key
import scala.io.Source

object KeyB {
  def main(args: Array[String]): Unit = {
    allWords("qwertyuiopasdfghjklzxcvbnm")
    //getThings()
  }
  def allWords(a:String): Unit ={
    Source.fromFile("dict.txt").getLines.toList.filter(_.matches("(["+a+"]*)") ).foreach(asd=>println(asd))
  }
}
