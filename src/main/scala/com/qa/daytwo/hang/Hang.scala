package com.qa.daytwo.hang

import com.qa.daytwo.hang.Hang.word

import scala.io.{Source, StdIn}
import scala.util.Random


//tolist --- disword
//filter foreach --- pl


object Hang {
  var word=""
  var disWord=""
  var life=0
  def main(args: Array[String]): Unit = {
    play()
  }
  //call this to play
  def play(): Unit ={
    life=5
    genWord()
    while(life>0){

      wordCheck()
      win()
    }
  }
  //checks if user can win
  def win(): Unit ={
    if (word==disWord){
      println(disWord+"\nYou win!\nPlay Again?(Y/N)")
      if ("y"==StdIn.readLine().toLowerCase()){
        play()
      }
    }
  }

  //draws hangman (kinda not really)
  def drawHang(): Unit ={ //idk how to draw hangman
    println("life: "+life)
  }
  //selects random word from dictionary (text file)
  def genWord(): Unit ={
    word=Random.shuffle(Source.fromFile("dict.txt").getLines).toList(0)
    disWord="_"*word.length
    println(word)
  }
  //gets user input
  def input(): Char ={
    println("Input?")
    StdIn.readChar().toLower
  }
  //compares input with character user has inputted
  def wordCheck(): Unit ={
    drawHang()
    disWord.foreach(ee=>print(ee+" "))
    var asd=input()
    if (word.contains(asd)){
      whichLetter(asd)
    }
    else{
      life-=1
    }
  }
  // if the character entered in was in the word then this will check where it was in the word
  def whichLetter(letterIn:Char): Unit ={
    var count=0
    var tempStr=""
    for(l<-disWord) {
      if (word(count)==letterIn){
        tempStr+=letterIn
      }else{
        if (disWord(count)!="_"){
          tempStr+=disWord(count)
        }else{tempStr+="_"}
      }
      count+=1
    }
    disWord=tempStr
  }

}
