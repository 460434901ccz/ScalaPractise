/**
  * ��д��������x^n������n��������ʹ�����µĵݹ鶨�壺
  * x^n = y^2,���n����ż���Ļ��������y=x^(n/2)
  * x^n = x * x^(n-1)�����n���������Ļ�
  * x^0 = 1
  * x^n = 1/x^(-n)�����n�Ǹ����Ļ�
  * ����ʹ��return���
  * Created by 46043 on 2016/10/9.
  */
object Practise10 {

  def f(x : Int, n : Int): Double = {
    if(n>0 && n%2==0) f(x, n/2)
    else if(n>0 && n%2!=0) x * f(x, n-1)
    else if(n<0) 1/ f(x, -n)
    else 1
  }

  def main(args: Array[String]) {
    println(f(10,0))
    println(f(10,1))
    println(f(10,2))
    println(f(10,-1))
  }

}
