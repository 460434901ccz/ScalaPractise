/**
  * 针对下列java循环编写一个Scala版
  * for(int i=10; i>=0; i--) System.out.println(i)
  * Created by 46043 on 2016/10/9.
  */
object Practise04 {

  def main(args: Array[String]) {
    for(i <- 0 to 10 reverse) println(i)
  }
}
