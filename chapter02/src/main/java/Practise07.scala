/**
  * �����ַ�����������ĸ��Unicode����ĳ˻�,��ʹ��ѭ��������ʾ����Scaladoc�в鿴StringOps��
  * ����˵����Hello���������ַ��ĳ˻���9415087488L
  * Created by 46043 on 2016/10/9.
  */
object Practise07 {

  def main(args: Array[String]) {
    val str = "Hello"
    var result = 1L
    str.foreach(result *= _)
    println(result)


  }

}
