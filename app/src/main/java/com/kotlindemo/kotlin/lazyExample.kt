package com.example.kotlinlanguage.kotlin

import kotlin.properties.Delegates

class Address(){
    init {
        println("Address is Initlized")
    }
}
class Student(){
    //val address = Address() it will initlize the address when we create instance of student
    val address by lazy { Address() } // will initlize address only when we use it
    var marks : Int by Delegates.observable(14){property, oldValue, newValue ->
        println("Old value is: "+oldValue)
        println("New value is: "+newValue)
    }
    var age: Int by Delegates.vetoable(14){property, oldValue, newValue ->
        println("Old value is: "+oldValue)
        println("New value is: "+newValue)
        newValue>=14
    }
}
fun main(){
    val student = Student()
}