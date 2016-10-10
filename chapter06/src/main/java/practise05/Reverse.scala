package practise05

/**
  * 编写一个Scala应用程序，使用App特质，以反序打印命令行参数，用空格隔开。举例来说，
  * scala Reverse Hello World 应该打印出World Hello
  * Created by 46043 on 2016/10/10.
  */
class Reverse extends App {
  for(arg <- args.reverse) print(arg + " ")
}
