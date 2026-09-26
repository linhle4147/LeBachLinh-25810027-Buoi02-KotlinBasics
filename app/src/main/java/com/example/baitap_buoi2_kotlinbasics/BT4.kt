package com.example.baitap_buoi2_kotlinbasics

fun main() {
    val canNangKg: Double = 68.5
    val chieuCaoMet: Double = 1.72

    val bmi: Double = canNangKg / (chieuCaoMet * chieuCaoMet)
    val phanLoai: String

    if (bmi < 18.5) {
        phanLoai = "Gay"
    } else if (bmi < 24.9) {
        phanLoai = "Binh thuong"
    } else if (bmi < 29.9) {
        phanLoai = "Thua can"
    } else {
        phanLoai = "Beo phi"
    }

    println("Chi so BMI: ${"%.2f".format(bmi)}")
    println("Phan loai: $phanLoai")
}