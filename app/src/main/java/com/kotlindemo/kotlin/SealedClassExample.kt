package com.example.kotlinlanguage.kotlin

sealed class Shape{
    class Circle(var radius: Int):Shape()
    class Rectangle(var length: Int,var breadth: Int):Shape()
    class Square(var side: Int):Shape()
}

fun main(){
    var circle = Shape.Circle(5)
    var rectangle = Shape.Rectangle(5,6)
    var square = Shape.Square(5)
    calculateArea(circle)
    calculateArea(rectangle)
    calculateArea(square)
}

fun calculateArea(shape: Shape){
    when(shape){
        is Shape.Circle-> println("Area of circle is: "+2*3.14*shape.radius)
        is Shape.Rectangle-> println("Area of Rectangle is: "+shape.length*shape.breadth)
        is Shape.Square-> println("Area of Square is: "+shape.side*shape.side)
    }
}