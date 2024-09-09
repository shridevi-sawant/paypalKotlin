package com.paypal.kotlinlearning

/*
write function which takes any number of strings (can be null)
- return concatenated strings with delimiter (default argument -)

fun concatenate()

concatenate("john", null, "merry", null)
return value = "john-merry"
 */

fun concatenate(vararg inputStrs: String?, delimiter: String = "-"): String{
    var result = ""
    for (str in inputStrs){
        if (str != null){
            result += str + delimiter
        }
    }

    return result
}

fun main() {
    println(concatenate("x", null, "y", delimiter = "*"))
}