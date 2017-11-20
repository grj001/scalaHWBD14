package com.zhiyou.bd14.function

object KeliFunction {

  //柯里化, 用法
  // 通过传部分参数
  def sum(x:Int)(y:Int)(z:Int) = x+y+z


  val sumland2 = sum(1)(2)(_)
  def test() ={
    println(sumland2(3))
    println(sumland2(10))
  }

  // 和隐式参数结合使用, 因为隐式参数的定义范围是小括号


  def main(args: Array[String]): Unit = {
    println(sum(1)(2)(3))
    test()
  }
}
