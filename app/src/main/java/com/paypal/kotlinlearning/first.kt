package com.paypal.kotlinlearning

fun main() {
    println("Hello World!")

    val city = "Bangalore" // immutable
    //city = "pune"

    var name: String // mutable

    name = "Shridevi"
    name = "PayPal"

    val pi: Float

    pi = 3.142f

    println("Name: $name") // String interpolation
    println("PI doubled: ${pi * 2}")
    println("PI: ${pi.toDouble()}")

    val number = 24 // Int
    var isEven = number % 2 == 0

    println("$number is even? : $isEven")

    val alpha = 'a'
    println("Character: $alpha, ASCII: ${alpha.code}")

    val message = """
        Hello
        Good morning
    """.trimIndent()


    println(message)

    if (message.isNotEmpty())
        println("First char: ${message.first()}")

    val uppered = message.uppercase()
    println(message)
    println("Uppered: $uppered")
}