/**
  * 编写一个函数product(s:String)，计算字符串中所有字母的Unicode代码的乘积
  * 举例说，“Hello”中所有字符的乘积是9415087488L
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
