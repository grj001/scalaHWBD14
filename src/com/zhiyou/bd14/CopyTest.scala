package com.zhiyou.bd14

object CopyTest {

  //柯里化, 用法
  // 通过传部分参数
  def sum(x:Int)(y:Int)(z:Int) = x+y+z


  val sumland2 = sum(1)(2)(_)
  def test() = {
    println(sumland2(3))
    println(sumland2)
  }



















}
