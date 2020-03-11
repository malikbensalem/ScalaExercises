package com.qa.rock

import scala.collection.mutable
import scala.util.Random.nextInt


class AI extends Person {
  var learner = mutable.Map("rock" -> 1, "paper" -> 1, "scissors" -> 1)

  override def inputMove: Unit = {
    val randInt = nextInt(learner.foldLeft(0)(_ + _._2))
    if (learner("rock") > randInt) {currentSymbol="rock"}
    else if (learner("rock") + learner("paper") > randInt) {currentSymbol="paper"}
    else {currentSymbol="scissors"}

  }
}
