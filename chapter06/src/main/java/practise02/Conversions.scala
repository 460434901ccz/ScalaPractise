package practise02

/**
  * ��дһ��Conversions���󣬼���inchesToCentimeters��gallonsToLiters��milesToKilometers����
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
