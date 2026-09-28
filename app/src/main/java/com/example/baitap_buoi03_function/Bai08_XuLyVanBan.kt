package com.example.baitap_buoi03_function

// Ho va ten: Le Bach Linh - MSSV: 25810027

fun xuLyVanBan(noiDung: String, boXuLy: (String) -> String): String {
    return boXuLy(noiDung)
}

fun vietHoaToanBo(s: String): String {
    return s.uppercase()
}

fun main() {
    val vanBan = "lap trinh kotlin buoi 3"

    // Cach 1: Lambda truc tiep
    val res1 = xuLyVanBan(vanBan, { str -> str.replace(" ", "_") })
    println("Cach 1: $res1")

    // Cach 2: Function reference
    val res2 = xuLyVanBan(vanBan, ::vietHoaToanBo)
    println("Cach 2: $res2")

    // Cach 3: Trailing lambda
    val res3 = xuLyVanBan(vanBan) { str ->
        "*** " + str.trim() + " ***"
    }
    println("Cach 3: $res3")
}