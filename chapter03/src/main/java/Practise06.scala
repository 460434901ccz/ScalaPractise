import scala.collection.mutable.ArrayBuffer

/**
  * 如何重新组织Array[Int]的元素将它们以反序排序？对于ArrayBuffer[Int]你又会怎么做
  * Created by 46043 on 2016/10/9.
  */
object Practise06 {

  def main(args: Array[String]) {
    val arr = Array(1.1, 1.2, 1.3, 1.4, 1.5)
    val arr2 = ArrayBuffer(1.1, 1.2, 1.3, 1.4, 1.5)
    println(arr.reverse.mkString(","))
    println(arr2.reverse.mkString(","))
  }
}
