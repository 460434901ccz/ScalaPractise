import scala.util.Random

/**
  * ��дһ�δ���,��a����Ϊһ��n���������������,Ҫ�����������0(����)��n(������)֮��
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
