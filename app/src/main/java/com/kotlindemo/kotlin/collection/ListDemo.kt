package com.kotlindemo.kotlin

private fun listdemo(){

}
private fun mutuableListDemp(){
    val arrayList = mutableListOf<String>()//Creating an empty arraylist
    arrayList.add("Ajay")
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print MutuableList.......")
    for (i in arrayList) {
        println(i)
    }

}

private fun arrayListDemo(){
    val arrayList = arrayListOf<String>()//Creating an empty arraylist
    arrayList.add("Ajay")//Adding object in arraylist
    arrayList.add("Vijay")
    arrayList.add("Prakash")
    arrayList.add("Rohan")
    arrayList.add("Vijay")
    println(".......print ArrayList.......")
    for (i in arrayList) {
        println(i)
    }
    println(arrayList)
}


fun main(){
    arrayListDemo()
}