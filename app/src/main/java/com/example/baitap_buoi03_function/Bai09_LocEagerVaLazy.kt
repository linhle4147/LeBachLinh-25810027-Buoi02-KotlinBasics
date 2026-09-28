package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun main() {
    val danhSachNhacCu = listOf("Guitar", "Piano", "Trong", "Glockenspiel", "Sao", "Guitar Bass")
    val chuCai = "G"

    // Loc thuong
    val ketQuaEager = danhSachNhacCu.filter { it.startsWith(chuCai, ignoreCase = true) }
    println("Loc thuong: $ketQuaEager")

    // Loc bang Sequence
    val ketQuaLazy = danhSachNhacCu.asSequence()
        .filter { it.startsWith(chuCai, ignoreCase = true) }
        .toList()
    println("Loc Sequence: $ketQuaLazy")
}