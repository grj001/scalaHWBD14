package com.zhiyou.bd14.implicitest

object ImplicitTest {


  //把金额转换成带币种符号的字符串, 接受两个参数
  // , 1.币种符号, 2. 金额
  def convertToAmount(amountType:String, amount:Double) = {
    s"$amount[$amountType]"
  }

  //如果把它做成隐式参数的化, 那么每次调用就可以不用再传递amountType参赛值
  // implicit只能在小括号最前面, 使用柯里化
  def convertToAmount1(amount:Double) (implicit amountType:String) = {
    s"$amount[$amountType]"
  }
  def test() = {
    implicit val amountType:String = "$"
//    implicit val error:String = "$"
    println(convertToAmount1(182.4))
  }

  def main(args: Array[String]): Unit = {
    println(convertToAmount("$", 182.4))
    test()
  }


}
