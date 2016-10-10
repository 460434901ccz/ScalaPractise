package practise10

/**
  * 重写该类，使用显式字段定义，，和一个缺省主构造器。你更倾向于使用哪种形式？为什么
  * class Employee(val name: String, var salary: Double) {
      def this() {this("John Q. Public", 0)}
    }
  *
  * Created by 46043 on 2016/10/10.
  */

class Employee{
  val name: String = "John Q. Public"
  var salary: Double = 0

}