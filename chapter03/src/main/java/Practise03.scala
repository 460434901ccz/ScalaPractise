import scala.collection.immutable.IndexedSeq

/**
  * ��дһ��ѭ�������������������ڵ�Ԫ���û������磬Array(1,2,3,4,5)�����û����Ϊ(2,1,4,3,5)
  * ����һ���µ�ֵ�����������顣��for/yield
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
