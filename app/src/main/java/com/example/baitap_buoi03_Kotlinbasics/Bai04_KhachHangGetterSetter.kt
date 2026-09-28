package com.example.baitap_buoi03_Kotlinbasics

// Ho va ten: Le Bach Linh - MSSV: 25810027

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split(" ", limit = 2)
            if (parts.size >= 2) {
                ho = parts[0]
                ten = parts[1]
            } else if (parts.isNotEmpty()) {
                ho = parts[0]
                ten = ""
            }
        }
}

fun main() {
    val kh = KhachHang("Nguyen", "An")
    println("Ho ten ban dau: ${kh.hoTen}")

    kh.ten = "Binh"
    println("Sau khi doi ten thanh Binh: ${kh.hoTen}")
    
    kh.hoTen = "Tran Cuong"
    println("Sau khi gan hoTen moi: Ho = ${kh.ho}, Ten = ${kh.ten}")
}