package com.example.homework2

fun main() {
    var persons= arrayListOf<String>("Eda","Elif","Mehmet","Ayşe","Zeynep")
    println("3 adet isim giriniz: ")
    var input= readLine()

    if(!input.isNullOrEmpty()){
        val newPersons= input.split(",").map {it.trim() } // başındaki ve sonundaki boşlukları silmek için
        persons.addAll(newPersons)
    }else{
        println("hiç isim girmediniz.")
    }
    println(persons)
}