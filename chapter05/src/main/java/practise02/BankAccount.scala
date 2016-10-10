package practise02

/**
  * 编写一个BankAccount类，加入deposit，withdraw方法，和一个只读的balance属性
  * Created by 46043 on 2016/10/10.
  */
class BankAccount {
  def deposit {}
  def withdraw {}
  private val balance = 0.0 : Double

  def readBalance = balance
}

object Main {
  def main(args: Array[String]) {
    val ba = new BankAccount
    println(ba.readBalance)
  }
}
