package practise02

/**
  * ��дһ��BankAccount�࣬����deposit��withdraw��������һ��ֻ����balance����
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
