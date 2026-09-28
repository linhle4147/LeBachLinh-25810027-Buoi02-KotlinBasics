package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun ghiNhatKyExplicit(hanhDong: String): Unit {
    println("[LOG]: $hanhDong")
}

fun ghiNhatKyImplicit(hanhDong: String) {
    println("[LOG]: $hanhDong")
}

fun main() {
    ghiNhatKyExplicit("Nguoi dung dang nhap thanh cong")
    ghiNhatKyImplicit("Nguoi dung dang xuat")
}