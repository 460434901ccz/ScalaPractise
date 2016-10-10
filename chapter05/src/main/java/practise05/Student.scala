package practise05

import scala.beans.BeanProperty

/**
  * 建立一个Student类，加入可读写的JavaBeans属性name（类型为String）和id（类型为Long）。
  * 有哪些方法被生成？（用javap查看）你可以在Scala中调用JavaBeans版中的getter和setter方法吗？
  * 应该这样做吗
  * Created by 46043 on 2016/10/10.
  */
class Student private {
  @BeanProperty
  var id : Long = 0
  @BeanProperty
  var name : String = ""

  def this(id : Long, name : String) {
    this()
    this.id = id
    this.name = name
  }
}

object Main {
  def main(args: Array[String]) {
    var stu = new Student(1, "01")
    println("id:" + stu.id + " name:" + stu.name)
    println("id:" + stu.getId+ " name:" + stu.getName)
  }
}
