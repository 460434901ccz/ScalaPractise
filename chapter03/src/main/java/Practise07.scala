import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * ��дһ�δ��룬���������е�����ֵ��ȥ���ظ������ʾ���鿴ScalaDoc��
  * Created by 46043 on 2016/10/9.
  */
object Practise07 {

  def main(args: Array[String]) {
    val arr = Array(1, 2, 3, 1, 4, 5,2, 6, 4, 5, 5, 2, 9, 1, 8)
    var repeatSet = new mutable.HashSet[Int]
    var repeatCount = 0
    for(i <- 0 until arr.length) {
      arr(i-repeatCount) = arr(i)
      if(repeatSet.contains(arr(i))) {
        repeatCount += 1
      } else {
        repeatSet += arr(i);
      }
    }
    println(arr.dropRight(repeatCount).mkString(","))
  }
}
