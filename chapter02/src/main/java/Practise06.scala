/**
  * 编写一个for循环，计算字符串中所有字母的Unicode代码的乘积。
  * 举例说，“Hello”中所有字符的乘积是9415087488L
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
