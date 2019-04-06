package com.libindev.kotlintemplates

fun main(){


    //if
    val a=5
    val b=10
    var max=0

    if (a < b) max = b

    println(max)

     max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println (max)

    println("__________________________")

    // when replace switch
 var x=12
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    //when  in range
    val validNumbers= intArrayOf(10,12)
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")// checks x is in valid Numbers Array
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    println("__________________________")

    //for
    val colors= arrayOf("yellow","green","black","blue","white")
    for (item in colors) println(item)

    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    for (i in colors.indices) {
        println(colors[i])
    }

    println("__________________________")

 //while


    x=10
    while (x > 0) {

      println( x)
        x--
    }

    do {
        val y = 10
        println("y=$y")
    }
    while (y != 10) // y is visible here!

}