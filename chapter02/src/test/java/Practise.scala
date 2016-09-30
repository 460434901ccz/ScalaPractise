import org.junit.Test

/**
  * Created by 46043 on 2016/9/30.
  */
class Practise {
  @Test
  def test() {
    print("test")
  }

  //to ����ѭ��
  @Test
  def testToFor() {
    var n = 10
    for(i <- 1 to n) {
      print(i + " ")
    }
  }

  //until����ѭ��
  @Test
  def testForUntil {
    var s = "hello"
    for(i <- 1 until s.length) {
      print(i + " ")
    }
  }

  //�ַ���ѭ��
  @Test
  def testForStr(): Unit = {
    var s = "hello"
    for(ch <- s) {
      print(ch + " ")
    }
  }

  //����break
  @Test
  def testBreak() {
    import scala.util.control.Breaks._
    breakable{
      for(i <- 1 to 5) {
        if(i == 3) break;
        print(i + " ")
      }
    }
  }

  //�����������for
  @Test
  def testMultiFor(): Unit = {
    for(i <- 1 to 3; j <- 1 to 3) {
      print( "" + i + j + " ")
    }
  }

  //����������������ĵ�for
  @Test
  def testMultiIfFor(): Unit = {
    for(i <- 1 to 3; j <- 1 to 3 if i != j) {
      print( "" + i + j + " ")
    }
  }

  //for��ʹ�ñ�������
  @Test
  def testMultiVarFor(): Unit = {
    for(i <- 1 to 3; from = 4-i; j <-  from to 3) {
      print( "" + i + j + " ")
    }
  }

  @Test
  def testFunction(): Unit = {
    def fac(n: Int): Int = if(n<=0) { print(1); 1} else {print(n); n * fac(n-1)}

    fac(5)
  }

  @Test
  def testDefaultParamFunction(): Unit = {
    def f(str1 : String = "default1", str2 : String = "default2"): Unit = {
      println(str1 + " " + str2)
    }

    f()
    f("not default1")
    f("not default1", "not default2")
  }

  @Test
  def testNotSureParamFunction(): Unit = {
    def f(args : Int*): Unit = {
      for(arg <- args) {
        print(arg + " ")
      }
    }

    f(1,2,3,4)
    f(1 to 4 : _*)
  }

  //����lazy������ʹ��ʱ�Ŵ��ļ�
  @Test
  def testLazy(): Unit = {
    lazy val file1 = scala.io.Source.fromFile("d:/1.txt")
  }

  //�����쳣����
  @Test
  def testException(): Unit = {

    try {
      val file1 = scala.io.Source.fromFile("d:/1.txt")
    } catch {
      case e: Exception => println("catch")
    } finally {

    }
  }
}
