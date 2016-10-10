package practise06

/**
  * Created by 46043 on 2016/10/10.
  */
object Poker extends Enumeration {
  val diamond, club, heart, spade = Value

  override def toString(): String = {
    diamond.toString + " " + club.toString + " " + heart.toString + " " + spade.toString
  }
}

object Main {
  def main(args: Array[String]) {
    println(Poker)
  }
}
