package com.dt.scala.hello

/**
  * Created by 46043 on 2016/10/8.
  */
object HelloScala {
  def main(args: Array[String]) {
    println("Hello world")
    for(arg <- args) println(arg)
  }
}
