package com.cloudmesoft.kotlintemplates



//eg : of  primary and  secondary constructor

class Students (var _first_name:String,var _last_name :String) { //primary constructor
      var _address :String=""
      var _ph :String=""

            //secondary constructor
            constructor(first_name:String,last_name:String,address:String,ph:String): this(first_name,last_name){
               this._address=address                                                     //this(first_name,last_name)  primary constructor call
               this._ph=ph

    }

    fun getFullName (function:(String,String)->String):String{ //higher order function

        return function(_first_name, _last_name)
       }
}