/**
  * 一个数字如果是正数，则它的signum为1，如果是负数，则signum为-1，如果是0，则signum为0
  * Created by 46043 on 2016/10/9.
  */
//
object Practise01 {

  def signum(num : Int): Int = {
    if(num > 0) 1 else if(num < 0) -1 else 0
  }

  def main(args: Array[String]) {
    println(">0 signum:" + signum(1))
    println("<0 signum:" + signum(-1))
    println("=0 signum:" + signum(0))
  }
}
