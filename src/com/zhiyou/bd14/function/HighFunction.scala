package com.zhiyou.bd14.function

object HighFunction {


  //高阶函数
  //定义一个函数, 它能够把金额转换成字符串, 并且加上币种符号
  def converToAmount(f:(Double)=>String, x:Double) = f(x)

  val rmbConvert = (amount:Double) => s"$amount 💴"
  val dollarConvert = (amount:Double) => s"${amount} ${"$"}"

  //函数当作返回的参数
  // 定义一个乘法器, 它能帮我们生成x乘以N的这样一些函数
  def mutiplyN(n:Int) = {
    (x:Int) => n*x
  }


  def main(args: Array[String]): Unit = {
    println(converToAmount(rmbConvert, 100))
    println(converToAmount(dollarConvert, 100))


    val mutiply5 = mutiplyN(5)
    println(mutiply5(3))
    println(mutiply5(6))
    println(mutiply5(9))

    val mutiply6 = mutiplyN(6)
    println(mutiply6(3))
    println(mutiply6(6))
    println(mutiply6(9))

    var free = 10
    val addFree = (x:Int) => x+free

    println(addFree(5))
    println(addFree(6))

    free = 20
    println(addFree(5))
    println(addFree(6))

    test()
    test01()
  }



  //定义一个函数, 这个函数运行时, 每次定义返回值都是原值 (某个自由变量) +1, 初始值1
  var addOne = 1
  def addOneFunction() = {
    addOne += 1
    addOne
  }
  def test() = {
    println(addOneFunction())
    println(addOneFunction())
    println(addOneFunction())
  }


  def addOneFunctionEnclose() = {
    var closeOne = 0
    val addOne = () => {
      closeOne += 1
      closeOne
    }
    addOne
  }
  def test01() ={
    val addOneEnclose = addOneFunctionEnclose()
    println(addOneEnclose())
    println(addOneEnclose())
    println(addOneEnclose())
  }

}
