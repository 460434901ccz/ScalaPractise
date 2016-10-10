import scala.collection.immutable.IndexedSeq
import scala.collection.mutable.ArrayBuffer

/**
  * 给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，
  * 以原有顺序排序，之后的元素是所有零和负值，以原有顺序排序
  * Created by 46043 on 2016/10/9.
  */
object Practise04 {

  def main(args: Array[String]) {
    val arr = Array(1, -1, 2, -3, 5, -2, 4, 0, 3)
    /*var arr2 = (arr.filter(_ > 0).toBuffer ++ (arr.filter(_ <= 0))).toArray
    println(arr2.mkString(","))*/
    val tuple = arr.partition(_ >0)
    val arr2 = Array.concat(tuple._1, tuple._2)
    println(arr2.mkString(","))
  }
}
