package com.example.homework2

fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )
    var newWorkers =workers.map { Workers(it.name,it.salary*1.35)}
    newWorkers=newWorkers.shuffled().sortedBy { it.salary }
    println(newWorkers)
    println("en yüksek maaş alan çalışan: ${newWorkers.maxBy { it.salary }}")
    println("en düşük maaş alan çalışan ${newWorkers.maxBy { it.salary }}")
    println("maaş ortalaması: ${newWorkers.sumOf { it.salary }/workers.size}")
}