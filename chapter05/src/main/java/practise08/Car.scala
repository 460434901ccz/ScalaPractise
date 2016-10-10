package practise08

/**
  * 创建一个Car类，以只读属性对应制造商、型号名称、型号年份以及一个可读写属性用于车牌
  * 提供四组构造器。每一个构造器都要求制造商和型号名称为必填。型号、型号年份以及车牌为可选，
  * 如果为填，则型号年份设置为-1，车牌设置为空字符串
  * 你会选择哪一个作为你的主构造器？为什么？
  * Created by 46043 on 2016/10/10.
  */
class Car (val manufacturer : String, val modelName : String
           , val modelYear : Int = -1, var license : String = ""){


  def this(manufacturer : String, modelName : String, license : String) {
    this(manufacturer, modelName, -1, license)
  }
}

object Main {
  def main(args: Array[String]) {
    var c1 = new Car("1", "1")

    printf("manufacturer:%s,modelName:%s,modelYear:%d,license:%s"
      , c1.manufacturer, c1.modelName, c1.modelYear, c1.license )
    println()

    var c2 = new Car("2", "2", 2)
    printf("manufacturer:%s,modelName:%s,modelYear:%d,license:%s"
      , c2.manufacturer, c2.modelName, c2.modelYear, c2.license )
    println()

    var c3 = new Car("3", "3", "3")
    printf("manufacturer:%s,modelName:%s,modelYear:%d,license:%s"
      , c3.manufacturer, c3.modelName, c3.modelYear, c3.license )
    println()

    var c4 = new Car("4", "4", 4, "4")
    printf("manufacturer:%s,modelName:%s,modelYear:%d,license:%s"
      , c4.manufacturer, c4.modelName, c4.modelYear, c4.license )
    println()
  }
}
