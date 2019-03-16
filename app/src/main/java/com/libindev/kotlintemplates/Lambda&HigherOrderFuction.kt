package com.libindev.kotlintemplates
//https://kotlinlang.org/docs/reference/lambdas.html
//(A, B) -> C

  val a = { i: Int,j :Int -> j + i } //lambda functions
  fun Int.square():Int { return this*this } // extension functions   Use:this function as common Util functions in project.
  val square_lambda: Int.() -> Int = {this*this}//same function as lambda


    val sum: Int.(Int) -> Int = { t  -> plus(t)//extension function with arguments
      //or this +t
    }

    fun concatenateAndPrint(func:(String, String)->(String), i:Int){ //higher order function

       for( j in 0..i){
        var  s=func("libin","mathew")
          print("$s \n")
        }
    }


fun main() {

      print(a.invoke(55,45)) // use invoke
      print(a(55,45))
      // or simply a()
      print(5.square())
      print(5.square_lambda())
      10.sum(500)

      concatenateAndPrint(
          { s1 :String, s2:String->
              s1.decapitalize()
              return@concatenateAndPrint  s1.capitalize()+" "+s2.capitalize()
      },10)
}