/**
  * 编写一个递归函数，计算字符串中所有字母的Unicode代码的乘积
  * 举例说，“Hello”中所有字符的乘积是9415087488L
  * Created by 46043 on 2016/10/9.
  */
object Practise09 {

  def product(s : String): Long = {
    if(s.length != 1) product(s.take(s.length-1)) * product(s.takeRight(1))
    else s(0).toLong
  }

  def main(args: Array[String]) {
    println(product("Hello"))
  }

}
