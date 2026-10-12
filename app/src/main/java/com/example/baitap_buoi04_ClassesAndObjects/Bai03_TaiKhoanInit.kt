package com.example.baitap_buoi04_ClassesAndObjects

// Ho va ten: Le Bach Linh - MSSV: 25810027
class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0) {
            println("So du khong hop le cho tai khoan: $soTaiKhoan")
        } else {
            println("Tao tai khoan $soTaiKhoan thanh cong voi so du ban dau: $soDu")
        }
    }
}

fun main() {
    val tkHopLe = TaiKhoanNganHang("TK001", 500000.0)

    val tkKhongHopLe = TaiKhoanNganHang("TK002", -100000.0)
}