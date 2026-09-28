package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun dinhDangDiaChi(
    soNha: String,
    duong: String,
    phuongXa: String = "Phuong Ben Nghe",
    quanHuyen: String = "Quan 1",
    thanhPho: String = "TP Ho Chi Minh"
): String {
    return "$soNha, $duong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi(
        "So 12",
        "Duong Le Duan",
        thanhPho = "Ha Noi"
    )
    println(diaChi1)

    val diaChi2 = dinhDangDiaChi(
        "So 45",
        "Duong Nguyen Hue",
        phuongXa = "Phuong 5",
        quanHuyen = "Quan 3"
    )
    println(diaChi2)
}