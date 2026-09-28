package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

// Ham 1: Binh phuong
fun binhPhuongFull(x: Int): Int {
    return x * x
}
fun binhPhuongShort(x: Int): Int = x * x

// Ham 2: Chu vi hinh vuong
fun chuViHinhVuongFull(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongShort(canh: Double): Double = canh * 4

// Ham 3: Kiem tra so chan
fun kiemTraChanFull(n: Int): Boolean {
    return n % 2 == 0
}
fun kiemTraChanShort(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Binh phuong: Full = ${binhPhuongFull(5)}, Short = ${binhPhuongShort(5)}")
    println("Chu vi: Full = ${chuViHinhVuongFull(3.5)}, Short = ${chuViHinhVuongShort(3.5)}")
    println("Kiem tra chan: Full = ${kiemTraChanFull(8)}, Short = ${kiemTraChanShort(8)}")
}