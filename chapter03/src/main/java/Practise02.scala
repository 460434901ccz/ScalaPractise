import scala.util.Random

/**
  * ��дһ��ѭ�������������������ڵ�Ԫ���û������磬Array(1,2,3,4,5)�����û����Ϊ(2,1,4,3,5)
  * Created by 46043 on 2016/10/9.
  */
object Practise02 {

  def main(args: Array[String]) {
    val arr: Array[Int] = Array(1,2,3,4,5)
    for(i <- 0 until arr.length if i%2!=0) {
      var tmp = arr(i)
      arr(i) = arr(i-1)
      arr(i-1) = tmp
    }
    println(arr.mkString(","))
  }
}
