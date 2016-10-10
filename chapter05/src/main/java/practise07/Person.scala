package practise07

/**
  * 编写一个Person类，其主构造器接受一个字符串，该字符串包含名字、空格和姓，
  * 如new Person("Fred Smith")。提供只读属性firstName和lastName。
  * 主构造器参数应该是var、val还是普通参数，为什么
  * Created by 46043 on 2016/10/10.
  */
class Person (name : String) {
  if(!name.contains("_")) throw new Exception ("error name")
  private val split: Array[String] = name.split("_")
  val firstName : String = split(0)
  val lastName : String = split(1)

}

object Main {
  def main(args: Array[String]) {
    val p: Person = new Person("c_cz")
    println("first name:" + p.firstName + ",last name:" + p.lastName)
  }
}
