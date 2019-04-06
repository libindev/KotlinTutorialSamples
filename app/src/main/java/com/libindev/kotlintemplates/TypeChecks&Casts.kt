package com.libindev.kotlintemplates



fun main(){

    var  obj :Any? = null

    if (obj is String) { // type checking
        print(obj.length)
    }

    if (obj is String) {
        print(obj.length) // x is automatically cast to String
    }
}