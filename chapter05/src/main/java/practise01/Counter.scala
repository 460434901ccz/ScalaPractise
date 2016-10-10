package practise01

/**
  * �Ľ���Counter���increment������ʹ����Ҫ��Int.MaxValueʱ��ɸ���
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
