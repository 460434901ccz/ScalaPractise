package com.dt.scala.hello

/**
  * Created by 46043 on 2016/10/8.
  */
object ScalaBasics {

  //函数定义
  def max(a:Int, b:Int): Int = {
    if(a>=b) a
    else b
  }

  //异常处理
  def e(): Unit = {
    throw new RuntimeException("oh my god")
  }

  def main(args: Array[String]) {
    //print(max(1,2))

    try {
      e
    } catch {
      case e : Exception => println(e.getMessage)
    } finally {
      println("finally")
    }
  }

}
