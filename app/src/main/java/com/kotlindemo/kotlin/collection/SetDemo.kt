package com.kotlindemo.kotlin

//Set interface does not support duplicate elements. This interface is immutable in nature its methods supports read-only functionality of the set.
private fun setDemo(){
    val set = setOf<String>("Sandeep","Mandeep","Gurdeep","Mandeep")//Creating an empty arraylist
    for (element in set){
        println(element)
    }
}
private fun mutableSetDemo(){
    val set = mutableSetOf<String>("Sandeep","Mandeep","Gurdeep","Mandeep")//Creating an empty arraylist
    set.add("Arun Saini")
    for (element in set){
        println(element)
    }
}
//tore elements using hashing mechanism. It does not support duplicate value and does not make guarantees about the order sequence of elemen
private fun hashSetDemo(){
    val set = hashSetOf<String>("Sandeep","Mandeep","Gurdeep","Mandeep")//Creating an empty arraylist
    set.add("Arun Saini")
    for (element in set){
        println(element)
    }
}

fun main(){
    //setDemo()
    //mutableSetDemo()
    hashSetDemo()
}