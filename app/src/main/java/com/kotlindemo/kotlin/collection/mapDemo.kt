package com.kotlindemo.kotlin.collection
// Order is not confirmed
private fun hashMapDemo(){
   /* val hashMap:HashMap<Int,String> = hashMapOf<Int,String>() //define empty hashmap
    hashMap.put(1,"Ajay")
    hashMap.put(4,"Praveen")
    hashMap.put(2,"Ajay")
    hashMap.put(3,"Vijay")
    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }*/
    val hashMap:HashMap<String,String> = hashMapOf<String,String>() //define empty hashmap
    hashMap.put("Sandeep Saini","Noida")
    hashMap.put("Vikrant Kumar","London")
    hashMap.put("Ryan","London")
    hashMap.put("Arun Saini","Amritsar")
    hashMap.put("Raj Karan","Chandigarh")
    println(".....traversing hashmap.......")
    for(key in hashMap.keys){
        println("Element at key $key = ${hashMap[key]}")
    }
}
// stored elemnt is sequesntial order
private fun mutuableMapDemo(){
    /*val map = mutableMapOf<Int,String>() //define empty hashmap
    map.put(1,"Ajay")
    map.put(3,"Vijay")
    map.put(4,"Praveen")
    map.put(2,"Ajay")
    println(".....traversing Mutuable Map.....")
    for(key in map.keys){
        println("Element at key $key = ${map[key]}")
    }*/
    val map = mutableMapOf<String,String>() //define empty hashmap
    map.put("Vikrant Kumar","London")
    map.put("Ryan","London")
    map.put("Arun Saini","Amritsar")
    map.put("Raj Karan","Chandigarh")
    println(".....traversing hashmap.......")
    for(key in map.keys){
        println("Element at key $key = ${map[key]}")
    }
}

fun main(){
    //mutuableMapDemo()
    hashMapDemo()
}