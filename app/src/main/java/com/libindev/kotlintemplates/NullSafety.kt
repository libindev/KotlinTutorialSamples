package com.libindev.kotlintemplates

//https://kotlinlang.org/docs/reference/null-safety.html

var  int:Int=10 //not null
var int2:Int? = null  //nullable int
fun main(){


    print(int)
    print(int2?.plus(10))//print null
    print(int2!!.plus(10))//!! operator   converts any value to a non-null type and throws an exception if the value is null
    print(int2 ?: -1) //Elvis Operator

}