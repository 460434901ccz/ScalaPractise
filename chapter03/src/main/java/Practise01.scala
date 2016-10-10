import scala.util.Random

/**
  * 编写一段代码,将a设置为一个n个随机整数的数组,要求随机数介于0(包括)和n(不包括)之间
  * Created by 46043 on 2016/10/9.
  */
object Practise01 {

  def main(args: Array[String]) {
    val n = 10
    var a = new Array[Int](n)
    for(i <- 0 until a.length) a(i) = Random.nextInt(n)
    println(a.mkString(","))
  }
}
