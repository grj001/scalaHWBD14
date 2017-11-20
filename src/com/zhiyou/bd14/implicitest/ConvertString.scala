package com.zhiyou.bd14.implicitest

import java.text.SimpleDateFormat

object ConvertStrings{
  implicit class ConvertString(s:String) {
    def printDateFormat() = {
      val format = new SimpleDateFormat("yyyy-MM-dd")
      val date = format.parse(s)
      println(date.getTime)
    }
  }
  def test() = {
    val strDate = "2017-11-17"
    strDate.printDateFormat()
  }



  def main(args: Array[String]): Unit = {
    test()
  }


}
