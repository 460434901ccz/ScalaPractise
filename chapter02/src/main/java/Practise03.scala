/**
  * 指出在Scala中何种情况下赋值语句x=y=1是合法的。（提示：给x找个合适的类型定义）
  * Created by 46043 on 2016/10/9.
  */
object Practise03 {
  def main(args: Array[String]) {
    var x = ()
    var y =  0
    x = y = 1
    println(x)
    println(y)
  }
}
