/**
  * ��дһ������product(s:String)�������ַ�����������ĸ��Unicode����ĳ˻�
  * ����˵����Hello���������ַ��ĳ˻���9415087488L
  * Created by 46043 on 2016/10/9.
  */
object Practise08 {

  def product(s : String): Long = {
    var result = 1L
    s.foreach(result *= _)
    result
  }

  def main(args: Array[String]) {
    println(product("Hello"))
  }

}
