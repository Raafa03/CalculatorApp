package com.example.calculatorapp.ui.theme

sealed class CalculatorOperation (val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("–")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}
