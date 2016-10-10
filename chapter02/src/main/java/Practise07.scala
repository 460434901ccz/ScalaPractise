/**
  * 计算字符串中所有字母的Unicode代码的乘积,不使用循环。（提示：在Scaladoc中查看StringOps）
  * 举例说，“Hello”中所有字符的乘积是9415087488L
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
