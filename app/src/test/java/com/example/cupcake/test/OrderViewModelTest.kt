package com.example.cupcake.test

import com.example.cupcake.ui.OrderViewModel
import org.junit.Assert.assertEquals
import org.junit.Test

class OrderViewModelTest {

    private val viewModel = OrderViewModel()

    @Test
    fun selectOption_quantity_updates_state_and_price() {
        viewModel.setQuantity(6)
        val currentState = viewModel.uiState.value
        assertEquals(6, currentState.quantity)
    }

    @Test
    fun selectOption_flavor_updates_state() {
        viewModel.setFlavor("Chocolate")
        val currentState = viewModel.uiState.value
        assertEquals("Chocolate", currentState.flavor)
    }

    @Test
    fun selectOption_date_updates_state() {
        val date = viewModel.uiState.value.pickupOptions[0]
        viewModel.setDate(date)
        val currentState = viewModel.uiState.value
        assertEquals(date, currentState.date)
    }

    @Test
    fun resetOrder_resets_uiState() {
        viewModel.setQuantity(6)
        viewModel.setFlavor("Chocolate")
        viewModel.resetOrder()
        val currentState = viewModel.uiState.value
        assertEquals(0, currentState.quantity)
        assertEquals("", currentState.flavor)
        assertEquals("", currentState.date)
    }
}
