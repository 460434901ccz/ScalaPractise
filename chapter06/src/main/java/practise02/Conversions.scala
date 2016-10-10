package practise02

/**
  * 编写一个Conversions对象，加入inchesToCentimeters、gallonsToLiters和milesToKilometers方法
  * Created by 46043 on 2016/10/10.
  */
object Conversions extends UnitConversion{
  override def inchesToCentimeters(): Unit = {
    println("inchesToCentimeters")
  }

  override def gallonsToLiters(): Unit = {
    println("gallonsToLiters")
  }

  override def milesToKilometers(): Unit = {
    println("milesToKilometers")
  }
}

object Main {
  def main(args: Array[String]) {
    Conversions.inchesToCentimeters()
    Conversions.gallonsToLiters()
    Conversions.milesToKilometers()
  }
}
