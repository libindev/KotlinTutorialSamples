package com.libindev.kotlintemplates

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            //Collections in Kotlin List,Set,Map

            var   list:  List<Int> = listOf(1,2,3) //read only list
                  list= listOf(1,256,452) //list  object  re_initialized  is possible

            var  mutableList :MutableList<Int> = mutableListOf<Int>(1,2,3)//read and write
                 mutableList.add(5) //add one  more  element

               //Hash Map
        val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
               println(readWriteMap["foo"])
            readWriteMap.put("hoo",1)

         readWriteMap.forEach{
            it.key
            it.value
         }










        var student=Students("libin","mathew")//primary constructor calling
        var studentWithAddress_ph =Students("nivin","jacab","1122","125525")//secondary calling

        val fullName = student.getFullName { s: String, s2: String -> s.capitalize() + " " + s2.capitalize()} //higher function call

       student.apply { //apply
         this._address="Grace Villa"
         this._ph="1254563236"
       }
        student.also {

        }
        student.run {

        }



        student.let {
            it._address="new address"
        }

        Toast.makeText(this@MainActivity,student._address,Toast.LENGTH_SHORT).show()

    }
}
