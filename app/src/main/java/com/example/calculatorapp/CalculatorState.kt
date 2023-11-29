package com.example.calculatorapp

import com.example.calculatorapp.ui.theme.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
