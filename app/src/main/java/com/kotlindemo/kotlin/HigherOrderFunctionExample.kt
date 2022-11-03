package com.example.kotlinlanguage.kotlin

fun main(){
    //var fn: (Double,Double)->Double = ::sum
    calculator(6.0,4.5,::sum)
}

fun sum (x: Double, y: Double): Double{
    return x+y
}
fun calculator(num1: Double,num2: Double , fn: (Double,Double)->Double){
    println ("Resule is: "+fn(num1,num2))
}
