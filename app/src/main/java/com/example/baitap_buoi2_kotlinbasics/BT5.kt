package com.example.baitap_buoi2_kotlinbasics

fun main() {
    val diemTrungBinh = 8.6

    val xepLoai = when {
        diemTrungBinh >= 9.0 && diemTrungBinh <= 10.0 -> "Xuat sac"
        diemTrungBinh >= 8.0 && diemTrungBinh < 9.0 -> "Gioi"
        diemTrungBinh >= 6.5 && diemTrungBinh < 8.0 -> "Kha"
        diemTrungBinh >= 5.0 && diemTrungBinh < 6.5 -> "Trung binh"
        diemTrungBinh >= 0.0 && diemTrungBinh < 5.0 -> "Yeu"
        else -> "Diem khong hop le"
    }

    println("Diem trung binh: $diemTrungBinh")
    println("Xep loai: $xepLoai")
}