package com.example.baitap_buoi03_Kotlinbasics

// Ho va ten: Le Bach Linh - MSSV: 25810027

class TaiKhoanNH(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nap thanh cong: $soTien")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        return if (soDu >= soTien && soTien > 0) {
            soDu -= soTien
            true
        } else {
            false
        }
    }
}

fun main() {
    val tk = TaiKhoanNH("TK888", 1000000.0)
    println("So du ban dau: ${tk.soDu}")

    tk.napTien(500000.0)
    println("So du sau khi nap 500k: ${tk.soDu}")

    val rut1 = tk.rutTien(300000.0)
    println("Rut 300k thanh cong: $rut1 | So du hien tai: ${tk.soDu}")

    val rut2 = tk.rutTien(2000000.0)
    println("Rut 2tr thanh cong: $rut2 | So du hien tai: ${tk.soDu}")
}