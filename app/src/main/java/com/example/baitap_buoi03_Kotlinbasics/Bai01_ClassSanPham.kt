package com.example.baitap_buoi03_Kotlinbasics

// Ho va ten: Le Bach Linh - MSSV: 25810027

class SanPham(
    val tenSanPham: String,
    val gia: Double,
    val soLuongTonKho: Int = 0
)

fun main() {
    val sp1 = SanPham("Ban phim co", 1500000.0, 10)
    println("San pham 1: Ten = ${sp1.tenSanPham}, Gia = ${sp1.gia}, Ton kho = ${sp1.soLuongTonKho}")

    val sp2 = SanPham(tenSanPham = "Chuot khong day", gia = 500000.0)
    println("San pham 2: Ten = ${sp2.tenSanPham}, Gia = ${sp2.gia}, Ton kho = ${sp2.soLuongTonKho}")
}