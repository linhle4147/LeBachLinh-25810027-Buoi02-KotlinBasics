package com.example.cupcake.data

/**
 * Data class that represents the current UI state in terms of [quantity], [flavor],
 * [date], [price], and available [pickupOptions].
 */
data class OrderUiState(
    val quantity: Int = 0,
    val flavor: String = "",
    val date: String = "",
    val price: String = "",
    val pickupOptions: List<String> = emptyList()
)
