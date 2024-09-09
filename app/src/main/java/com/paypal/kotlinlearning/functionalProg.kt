package com.paypal.kotlinlearning

fun multiply(a: Int, b: Int) = a * b

fun divide(x:Int, y: Int) = x / y

fun main() {
    var x : Int
    var mathOp : (Int, Int) -> Int

    mathOp = ::multiply // :: - function referencing operator

    mathOp = ::divide

    doOperation(10, 2, { a, b -> a * b})

    doOperation(10, 2) { a, b -> a / b} // trailing lambda

    var number = -4

    while (number != 0){
        println("Number: $number")
        val op = makeZero(number)
        number = op(number)
    }

    // lambda with one arg

    var converter : (String) -> String

    converter = {
        println("converting to uppercase")
        it.uppercase()
    }

    println(converter("john"))
    // add lambda for replacing space with *

    converter = { inpStr ->
        inpStr.replace(" ", "*")
    }
    println(converter("john smith"))

    // via extension
    println("xyz".converter())
}

// type - () -> Unit
fun display() {
    print("hello")
}

// functional programming - javascript, python, swift, kotlin, go, dart

// higher-order functions - input or return is function type
fun doOperation(arg1:Int, arg2: Int, op : (Int, Int)-> Int){

    val result = op(arg1, arg2)
    println("RESULT: $result")
}

fun increment(x: Int) = x+1

fun decrement(x: Int) = x-1

// higher order
fun makeZero(num: Int) : (Int) -> Int {
    return if (num > 0) ::decrement else ::increment
}

fun String.converter() :String{
    return this.uppercase()
}

fun Int.mm() : Int {
    return this * 1000
}

fun Array<Int>.print(){
    for (num in this){
        print("$num ")
    }
}

