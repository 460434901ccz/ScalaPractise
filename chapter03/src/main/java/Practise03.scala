import scala.collection.immutable.IndexedSeq

/**
  * 编写一个循环，将整数数组中相邻的元素置换。例如，Array(1,2,3,4,5)经过置换后变为(2,1,4,3,5)
  * 生成一个新的值交换过的数组。用for/yield
  * Created by 46043 on 2016/10/9.
  */
object Practise03 {

  def main(args: Array[String]) {
    val arr: Array[Int] = Array(1,2,3,4,5)
    val arr2 = for(i <- 0 until arr.length) yield {
      if(i%2==0 && i<arr.length-1)arr(i+1)
      else if(i%2==0 && i==arr.length-1) arr(i)
      else arr(i-1)
    }
    println(arr2.mkString(","))
  }
}
