package com.zhiyou.bd14.function

object FunctionParams {

  //scala中函数的参数可以在定义时副一个默认值, 如果一个参数有默认值, 那么在这个
  // 函数在被调用时有默认值的参数可以不用传参
  def multySum(x:Int,y:Int = 1,z:Int = 1): Int ={
    println(s"x = $x")
    println(s"y = $y")
    println(s"z = $z")
    x*y*z
  }

  def main(args: Array[String]): Unit = {
    //不穿默认参数调用函数
    println(multySum(10))
    //传递默认参数值, 则默认失效而所有我们传递的参数值
    println(multySum(10,2))

    //当我们传递的默认值和参数定义顺序不一致的时候,
    // 可以所有带名传参的方式来自动参数是为谁传的
    println(multySum(10,z=15))

    println(multySum(y=3,z=5,x=2))


    //高阶函数

  }































}
