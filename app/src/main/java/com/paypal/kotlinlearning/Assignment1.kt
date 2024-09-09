package com.paypal.kotlinlearning

fun main() {


    val msg = "Hello PayPal, Bangalore"

    var vowelCount = 0
    var consonantCount = 0
    var spaceCount = 0

    for (ch in msg){

        when(ch.lowercaseChar()) {
            ' ' ->  spaceCount++
            'a', 'e', 'i','o','u' -> vowelCount++

        }

    }
    println("VowelCount: $vowelCount")
    vowelCount = 0
    val vowelArr = arrayOf('a', 'e', 'i', 'o', 'u')
    for (ch in msg){

        when {
            vowelArr.contains(ch) -> vowelCount++
            ch.isDigit()-> {}
            ch == ' ' -> {}

        }

    }

    println("VowelCount: $vowelCount")

    for (num in 2..20){
        var isPrime = true
        for(divisor in 2..(num-1)){
            if (num % divisor == 0){
                isPrime = false
                break
            }
        }

        if (isPrime)
            println("$num is prime")
    }
}

/*
print no of vowels, consonants, special chars, spaces, digits
 */

/*
print all prime numbers between 1 to 20

 */