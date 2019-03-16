package com.libindev.kotlintemplates

fun powerOf(number: Int, exponent: Int) {  } //function notation

fun areaofCirle(radius:Double,PI:Double = 3.14):Double{
    return radius*radius*PI
}//function with default argument pie

  fun double(x: Int): Int = x * 2 //single expression   function




fun main() {

  print( areaofCirle(5.0)) // default  value  for PI
  print( " "+areaofCirle(5.0,3.14159))//PI value changed to 3.14159

}

