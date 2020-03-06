package com.qa.rock

import scala.collection.mutable

class AI extends Person {
  var learner=mutable.Map("r"->1,"p"->1,"s"->1)
  var shortTermLearner=mutable.Map("r"->1,"p"->1,"s"->1)

  def learn(syms:List[Symbol]): Unit ={

  }
}
