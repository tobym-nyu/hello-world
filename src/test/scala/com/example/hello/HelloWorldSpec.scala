package com.example.hello

import org.scalatest._
import org.scalatest.Matchers._

class ProblemSetSpec extends FlatSpec {

  behavior of "HelloWorld"

  it should "say hello to you" in {
    HelloWorld.hello("alice") shouldBe "hello, alice"
  }

}
