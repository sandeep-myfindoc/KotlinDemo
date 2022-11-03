package com.example.kotlinlanguage.kotlin

fun main(){
    println(DbManager)
    println(DbManager)
    DbManager("Instance Created")// it will call the invoke operator intranly
    DbManager.storeValue("Sandeep")
    DbManager.storeValue("Mandeep")
    println(DbManager.getValue())
}
object DbManager{
    private var list = mutableListOf<String>()
    init {
        println("Db intilized")
        println(list)
    }
    operator fun invoke(value: String){
        list.add(value)
    }
    fun storeValue(value: String){
        list.add(value)
    }
    fun getValue():MutableList<String>{
        return list
    }
}
