/**
  * ��дһ������countdown(n:Int),��ӡ��n��0������
  * Created by 46043 on 2016/10/9.
  */
object Practise05 {

  def countdown(n : Int) {
    for(i <- 0 to n reverse) println(i)
  }

  def main(args: Array[String]) {
    countdown(10)
  }
}
