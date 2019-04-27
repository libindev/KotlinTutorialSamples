package com.libindev.kotlintemplates

fun main(){

    fun MutableList<Int>.sumof():Int { // extension function
        var sum=0
        for (i in this){
            sum= sum + i
        }

        return sum

    }


    val l= mutableListOf(1, 2, 3,2,8,4)
     print( "Sum of array :"+l.sumof())
}