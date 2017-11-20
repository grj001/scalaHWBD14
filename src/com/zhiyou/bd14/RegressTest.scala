package com.zhiyou.bd14


object RegressTest {


  //定义一个函数, 接受两个参数, 一个是x, 一个年返回x的n次方
  def nMultiply(x: Int, n: Int): Unit = {
    var y = x
    for (i <- 1 until n) {
      y = y * x
    }
  }


  //递归写法
  def rnMultiply(x:Int,n:Int): Long ={
    x * (if(n==1) 1 else rnMultiply(x,n-1))
  }


  //计算n的阶乘


  def main(args: Array[String]): Unit = {
    println(nMultiply(5, 3))
    println(rnMultiply(5, 3))

  }

  def rList(list:List[Int]):Int = {
    if(list ==Nil) 0 else list.head + rList(list.tail)
  }

  //从list的尾部开始计算

}

