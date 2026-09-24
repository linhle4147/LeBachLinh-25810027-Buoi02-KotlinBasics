package com.example.baitap_buoi2_kotlinbasics
fun main() {
    val soLuong: Int = 5
    val donGia: Double = 150000.0
    val thueSuat: Double = 0.08

    val tienHang: Double = soLuong.toDouble() * donGia
    val tienThue: Double = tienHang * thueSuat
    val tongTien: Double = tienHang + tienThue

    println("So luong: $soLuong cai")
    println("Don gia: $donGia VND")
    println("Tien hang: $tienHang VND")
    println("Thue VAT (8%): $tienThue VND")
    println("Tong tien thanh toan: $tongTien VND")
}