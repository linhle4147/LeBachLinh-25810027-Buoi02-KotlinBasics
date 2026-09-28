package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

val ketQua1 = tinhDienTich(5.0, 3.5).also { println("Dien tich 1: $it") }
val ketQua2 = tinhDienTich(10.2, 4.0).also { println("Dien tich 2: $it") }

fun main() {
    println("Dien tich 1: ${tinhDienTich(5.0, 3.5)}")
    println("Dien tich 2: ${tinhDienTich(10.2, 4.0)}")
}