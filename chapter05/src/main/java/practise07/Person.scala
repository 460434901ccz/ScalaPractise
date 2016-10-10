package practise07

/**
  * ��дһ��Person�࣬��������������һ���ַ��������ַ����������֡��ո���գ�
  * ��new Person("Fred Smith")���ṩֻ������firstName��lastName��
  * ������������Ӧ����var��val������ͨ������Ϊʲô
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
