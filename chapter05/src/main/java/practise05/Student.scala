package practise05

import scala.beans.BeanProperty

/**
  * ����һ��Student�࣬����ɶ�д��JavaBeans����name������ΪString����id������ΪLong����
  * ����Щ���������ɣ�����javap�鿴���������Scala�е���JavaBeans���е�getter��setter������
  * Ӧ����������
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
