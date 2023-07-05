package com.example.homework2

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    names.sort()
    println("Bir isim girin: ")
    val input= readLine()

    if(names.contains(input)){
        println(names.find{it==input}!!.uppercase().reversed())
    }


}