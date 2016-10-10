package practise06

/**
  * 提供一个主构造器，将负年龄转换位0
  * Created by 46043 on 2016/10/10.
  */
class Person (var age : Int){
  if(age<0) age = 0
}

object Main {
  def main(args: Array[String]) {
    val p1: Person = new Person(1)
    val p2: Person = new Person(-1)
    println("p1:" + p1.age + ",p2:" + p2.age)
  }
}
