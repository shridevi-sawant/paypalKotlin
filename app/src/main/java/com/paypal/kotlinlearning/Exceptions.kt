package com.paypal.kotlinlearning

import java.util.Date


fun main() {

    val d1 = Date()

    println(d1.time)


    val result = doDivision(10, 0)
    println(result)
    try {
        upload()
    }catch (e: HTTPException){
        println("ERROR: ${e.localizedMessage}, ${e.errCode}")
    }
}
// try-catch - as expression
fun doDivision(number: Int, divisor: Int) : Int {
    val result = try {
        number / divisor
    } catch(e: ArithmeticException) {
        println("ArithMatic : ${e.localizedMessage}")
        0
    }catch (e: Exception){
        println("Unknown: ${e.localizedMessage}")
        0
    }finally {
        println("done")
    }

    return result

}

class HTTPException(val errCode: Int): Exception(){



}

fun upload(){
    // TODO - code to send data to server
    val responseCode = 404

    if (responseCode != 200){
        throw HTTPException(responseCode)
    }
}

/*
Kotlin - all exception are unchecked
 */