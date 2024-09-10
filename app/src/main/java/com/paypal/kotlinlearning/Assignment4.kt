package com.paypal.kotlinlearning

fun main() {

    val names = listOf("john", null, "merry", "elizabeth", "robert", "albert")


    // lengthiest name -reduce

    val lengthiestName = names.reduce { arg1, arg2 ->
        val name1 = arg1 ?: ""
        val name2 = arg2 ?: ""

        if (name1.length > name2.length) name1 else name2
    }

    println("Lenghtiest name: $lengthiestName")

}