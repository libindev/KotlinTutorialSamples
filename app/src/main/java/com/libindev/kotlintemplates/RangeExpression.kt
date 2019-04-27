package com.libindev.kotlintemplates

fun main(){
   // Range expressions are formed with rangeTo functions that have the operator form ..
var i= 7
    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println(i)
    }

    for (i in 1..4) print(i)// print  one to four.
    println("\t")

    for (i in 4 downTo 1) print(i) //print  four  to  one.

    println("\t")

    for (i in 1..4 step 2) print(i)// 1,3
    println("\t")

    for (i in 4 downTo 1 step 2) print(i)//4,2
    println("\t")

    for (i in 1 until 10) {// i in [1, 10), 10 is excluded

        print(i)
    }


}