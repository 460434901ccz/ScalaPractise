package practise04

/**
  * ����һ��Point���һ����������ʹ�����ǿ��Բ���new��ֱ����Point(3,4)������Pointʵ��
  * Created by 46043 on 2016/10/10.
  */
class Point private(var x : Double, var y : Double) {

}

object Point {
  def apply(x: Double, y: Double): Point = new Point(x, y)
}

object Main {
  def main(args: Array[String]) {
    val p: Point = Point(1,2)
    printf("x:%f,y:%f", p.x, p.y)
  }
}
