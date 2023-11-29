package com.example.calculatorapp

import com.example.calculatorapp.ui.theme.CalculatorOperation

sealed class CalculatorActions{
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperation): CalculatorActions()
}
