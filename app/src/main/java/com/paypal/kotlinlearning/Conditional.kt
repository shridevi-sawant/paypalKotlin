package com.paypal.kotlinlearning

fun main() {

    val num1 = 10
    val num2 = 20

    var highNum : Int

    // if as statement
    if (num1 > num2){
        highNum = num1
    }else {
        highNum = num2
    }

    println("MAX: $highNum")

    // if as an expression - else is mandatory, no ternary operator

    highNum = if (num1 > num2 ) num1 else num2

    highNum = if (num1 > num2 ) {
        println("num1 is higher")
        num1
    } else {
        num2

    }

    println("MAX: $highNum")

    val marks = 59
    // as a statement
    when (marks) {
        100 -> println("Excellent")
        in 75..100 -> println("Distinction")
        in 65..75 -> println("First class")
        else -> {
            println("Marks : $marks")
        }
    }

    // as a expression, else is mandatory

    val grade : String

    grade = when (marks) {
        in 75..100 -> {
            println("Distinction")
            "A+"

        }
        in 65..75 -> "A"
        in 55..65 -> "B+"
        else -> {
            "B"
        }

    }

    println("GRade: $grade")
}