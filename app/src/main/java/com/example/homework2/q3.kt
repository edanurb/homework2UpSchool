package com.example.homework2

fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )
    val oldestStudent= students.maxBy { it.age }
    val youngestStudent=students.minBy { it.age }
    println("en yaşlı öğrenci: ${oldestStudent.name} ve bu öğrencini index numarası: ${students.indexOf(oldestStudent)}")
    println("en genç öğrenci: ${youngestStudent.name} ve bu öğrencini index numarası: ${students.indexOf(youngestStudent)}")


    val studentsOfUniversityA=students.filter { it.school=="Üniversite A" }
    println("Üniversite A'nın öğrencileri ${studentsOfUniversityA}")
    println("25 yaşından büyük öğrenciler:")
    studentsOfUniversityA.filter { it.age>=25 }.forEach{println(it.name)}
    println("25 yaşından küçük öğrenciler:")
    studentsOfUniversityA.filter { it.age<25 }.forEach {println(it.name)}

}