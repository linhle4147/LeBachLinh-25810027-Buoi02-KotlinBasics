package com.example.baitap_buoi2_kotlinbasics

fun main() {

    val soDuBanDau: Double = 5000000.0
    var soDuHienTai: Double = soDuBanDau

    println("So du ban dau: $soDuBanDau VND")

    val tienGui: Double = 2000000.0
    soDuHienTai += tienGui
    println("Gui them: $tienGui VND -> So du hien tai: $soDuHienTai VND")

    val tienRut: Double = 1500000.0
    soDuHienTai -= tienRut
    println("Rut bot: $tienRut VND -> So du hien tai: $soDuHienTai VND")

    println("So du ban dau de doi chieu: $soDuBanDau VND")
}