/**
  * ��дһ��forѭ���������ַ�����������ĸ��Unicode����ĳ˻���
  * ����˵����Hello���������ַ��ĳ˻���9415087488L
  * Created by 46043 on 2016/10/9.
  */
object Practise06 {

  def main(args: Array[String]) {
    val str = "Hello"
    var result = 1L
    for(ch <- str) result *= ch.toLong
    println(result)

  }

}
