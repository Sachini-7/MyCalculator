package com.example.mycalculator.models

class Calculator (private val number1:Double, private val number2:Double){
    fun add() = number1 + number2
    fun substract() = number1 - number2
    fun multiply() = number1*number2
    fun devide() = number1/number2
}