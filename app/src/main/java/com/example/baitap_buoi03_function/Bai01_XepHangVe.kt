package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun main() {
    val tuoi = 20

    val loaiVe = if (tuoi < 12) {
        "Ve tre em"
    } else if (tuoi >= 60) {
        "Ve cao tuoi"
    } else {
        "Ve nguoi lon"
    }

    println("Tuoi: $tuoi -> Loai ve: $loaiVe")
}