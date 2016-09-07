package com.example.hello

object HelloWorld {

  def main(args: Array[String]) {
    val name = if (args.length > 0) args(0) else "world"
    println(hello(name))
  }

  def hello(name: String): String = s"hello, $name"

}
