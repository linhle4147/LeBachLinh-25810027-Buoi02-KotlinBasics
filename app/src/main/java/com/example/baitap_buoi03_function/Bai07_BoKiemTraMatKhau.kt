package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun main() {
    val kiemTraDoDai: (String) -> Boolean = { matKhau ->
        matKhau.length >= 8
    }

    val pass1 = "12345"
    val pass2 = "kotlin123"
    val pass3 = "secure_pass_2026"

    println("Mat khau '$pass1' hop le: ${kiemTraDoDai(pass1)}")
    println("Mat khau '$pass2' hop le: ${kiemTraDoDai(pass2)}")
    println("Mat khau '$pass3' hop le: ${kiemTraDoDai(pass3)}")
}