package com.paypal.kotlinlearning

fun add(a: Int, b:Int): Int {
    val result = a + b
    println("$a + $b = $result")
    return result
}

// required args
fun add(a:Double, b: Double): Double{
    return a + b
}

fun main() {

    val x = add(10, 20)
    val y = add(10.2, 20.4)
    println(y)

    //named arguments
    displayInfo(age=30, city = "Pune", name = "john")
    displayInfo("merry", city = "Bangalore", age = 40)

    calculateEMI(1000)
    calculateEMI(1000, 20)
    calculateEMI(1000, duration = 24)

    aggregateSum()
    aggregateSum(1,2,34 )
}

fun displayInfo(name: String, age: Int, city: String){
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}

// default args
//1. placed after required args
fun calculateEMI( amount: Int, rate : Int = 20, duration: Int = 12){
    println("Amount: $amount")
    println("Rate: $rate")
    println("Duration: $duration")

}

// variable length - placed after required, only one
fun aggregateSum(vararg numbers: Int): Int{
    var sum = 0
    for (num in numbers){
        sum += num
    }
    println("Cumulative sum: $sum")
    return sum
}