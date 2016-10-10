package practise03

/**
  * ��дһ��Time�࣬����ֻ������hours��minutes��
  * ��һ�����ĳһʱ���Ƿ�������һʱ��before(other:Time):Boolean��
  * Time����Ӧ����new Time(hrs,min)��ʽ����������hrsСʱ���Ծ���ʱ���ʽ���֣�����0��23֮�䣩
  *
  * Created by 46043 on 2016/10/10.
  */
class Time private {
  private var hours : Int = 0
  private var minutes : Int = 0

  def this(hours : Int, minutes : Int) {
    this()
    if(hours>23 || hours<0 || minutes>60 || minutes<0) {
      throw new Exception("error time!")
    }
    this.hours = hours
    this.minutes = minutes
  }

  def before(other : Time): Boolean = {
    if (this.hours < other.hours)  true
    else if(this.hours > other.hours) false
    else {
      if(this.minutes < other.minutes) true
      else false
    }
  }

}

object Main {
  def main(args: Array[String]) {
    val t1 = new Time(22, 23)
    val t2 = new Time(22, 23)
    println(t1.before(t2))
  }
}
