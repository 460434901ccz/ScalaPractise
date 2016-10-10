package practise01

/**
  * 改进在Counter类的increment方法，使它不要在Int.MaxValue时变成负数
  * Created by 46043 on 2016/10/10.
  */
class Counter {
  private var value = 0
  def increment() {if(value!=Int.MaxValue)value += 1}
  def current() = value
}

object Main {
  def main(args: Array[String]) {
    val counter: Counter = new Counter()

    for(i <- 0 until Int.MaxValue)counter.increment()
    println("MaxValue:" + Int.MaxValue)
    println(counter.current)

    counter.increment()
    println("increment again:" + counter.current)
  }
}
