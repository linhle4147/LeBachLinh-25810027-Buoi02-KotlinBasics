package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Ban thuong") {
    println("Dat ban thanh cong cho $tenKhachHang | So luong: $soLuongKhach nguoi | Loai: $loaiBan")
}

fun main() {

    datBan("Nguyen Van A", 4)

    datBan("Tran Thi B", 2, "Ban VIP")

    datBan(soLuongKhach = 6, loaiBan = "Ban ngoai troi", tenKhachHang = "Le Van C")
}