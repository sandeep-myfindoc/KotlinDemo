package com.example.kotlinlanguage.kotlin

class StudentData(var name: String, var age: Int) {
     companion object SchoolInfo {
        private var noOfStudents : Int = 0
         @JvmStatic
        fun getSchoolName():String {
            return "St Stephens"
        }
         @JvmStatic
         fun getSchoolAddress():String {
             return "Krishna Nagar, Amritsar"
         }
    }

}

fun main() {
// accessing static methods (which uses private variable)
    var student1 = StudentData("Abhishek", 18)
    println(StudentData.getSchoolName())

    var student2 = StudentData("Karthik", 18)
    println(StudentData.getSchoolAddress())
}