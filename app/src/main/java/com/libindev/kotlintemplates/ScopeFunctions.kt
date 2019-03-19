package com.libindev.kotlintemplates
//https://kotlinlang.org/docs/reference/scope-functions.html


//distinguish scope methods
//The way to refer to the context object
//The return value.

//there are five of them: let, run, with, apply, and also.

//Basically, these functions do the same: execute a block of code on an object.
// What's different is how this object becomes available inside the block
// and what is the result of the whole expression.

//apply and also return the context object.
//let, run, and with return the lambda result.

//The return value of apply and also is the context object itself.

 fun main(){
  var k=    Person ("Mark",10,"Amsterdam").let {
      it.age=15
      it.city="New York"
      return@let it.city
       } //

     var p1 = Person("Jose",15,"NewYork")
      println(   p1.let {
             it.age=11
             it.city="Dubai"

          return@let it.city
         })

     print(p1.city)


   var p=  Person ("Mark",10,"Amsterdam").apply {
         this.age=15
         this.city="New York"

     }    //returns context objects


      var d=Person(name = "John", age = 10, city = "Dubai").run {

          val s= city
          return@run name+s.capitalize()
       } // returns lambda expression

     val numbers = mutableListOf("one", "two", "three")

 val s=     numbers.run {
         add("four")
         add("five")

         return@run count {
             it.endsWith("r")
             it.endsWith("e")
         }
        }
     println("There are $s elements that end with e.")

 }
