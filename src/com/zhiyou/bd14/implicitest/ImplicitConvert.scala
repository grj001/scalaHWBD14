package com.zhiyou.bd14.implicitest

object ImplicitConvert {

   //定义一个隐式转换, 把Double类型的数值转换成类型
  implicit def convertDoubleToInt(x:Double) = x.toInt
  def test() = {
    val intType:Int = 33.5
    println(intType)
  }

  def test01() = {
    implicit def convertStringToMyString(x:String)=new MyString(x)
    val str = "abjdkag"
    str.printForEachChar()
  }


  def main(args: Array[String]): Unit = {
//    test()
//    test01()

  }

}



class MyString(val s:String){
  //打印每个字符, 用逗号分割
  def printForEachChar() = {
    s.foreach(x => print(s"$x,"))
  }
}