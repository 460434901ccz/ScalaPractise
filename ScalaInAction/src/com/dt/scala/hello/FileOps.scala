package com.dt.scala.hello

import scala.io.Source

/**
  * Created by 46043 on 2016/10/8.
  */
object FileOps {
  def main(args: Array[String]) {
    val web = Source.fromURL("https://spark.apache.org/");
    for(line <- web.getLines) {
      println(line)
    }
  }
}
