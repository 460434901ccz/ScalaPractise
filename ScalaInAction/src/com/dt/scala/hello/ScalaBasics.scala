package com.dt.scala.hello

/**
  * Created by 46043 on 2016/10/8.
  */
object ScalaBasics {

  //��������
  def max(a:Int, b:Int): Int = {
    if(a>=b) a
    else b
  }

  //�쳣����
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
