package com.example.baitap_buoi04_ClassesAndObjects

// Ho va ten: Le Bach Linh - MSSV: 25810027

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {

    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {
    val nv1 = NhanVien("NV01", "Nguyen Van A", 15000000.0)
    println("Nhan vien 1: Ten = ${nv1.ten}, Luong = ${nv1.luongThang}")

    val nv2 = NhanVien("Tran Thi B")
    println("Nhan vien 2: Ten = ${nv2.ten}, Luong = ${nv2.luongThang}")
}