package com.raja.calculator

import com.raja.calculatorfunctions.CalcFunctions

public class CalcOperations {

    fun Add(a: Int, b: Int): Int {
        return a + b
    }

    fun Subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun Multiply(a: Int, b: Int): Int {

        val abc = CalcFunctions().Multiply(4, 3)

        return a * b
    }


}