package com.example.baitap_buoi2_kotlinbasics

fun main() {
    val fibList = mutableListOf(0, 1)

    for (i in 2..100) {
        val nextFib = fibList[i - 1] + fibList[i - 2]
        if (nextFib >= 100) break
        fibList.add(nextFib)
    }

    println("Day so Fibonacci nho hon 100:")
    for (index in fibList.indices) {
        println("Vi tri $index gia tri: ${fibList[index]}")
    }
}