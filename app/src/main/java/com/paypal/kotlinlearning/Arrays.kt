package com.paypal.kotlinlearning

fun main() {
    val numbers = arrayOf(10,20,30,40,50)

    println("Size: ${numbers.size}")
    println("First element: ${numbers[0]}, ${numbers.first()}")

    numbers[0] = 100
    println(numbers.contentToString())

    //numbers = arrayOf(1,3,5)

    val numRange = 1..10

    println(numRange.contains(10))

    // infix function
    val x = 100 downTo 10 step 10//100.downTo(10).step(10)
    println("RANGE---")
    for (element in x){
        println(element)
    }


}