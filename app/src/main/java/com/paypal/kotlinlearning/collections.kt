package com.paypal.kotlinlearning

/*
Array - ordered, fixed size
List - ordered, dynamic array
Set - unordered, unique elements
Map - unordered, key-value
 */

fun main() {

    //List<T>, MutableList
    val data = mutableListOf<Int>(1,10,20,30,20) // mutable


    data.add(11)
    data.add(0, 10)

    data[0] = 11

    println(data)

    val anotherData = listOf<Any>(2,3,5,7,11, 34.56, false, "abc")

    println(anotherData)

    // Set

    val evenNumber = setOf(2,4,6,8) // immutable
    val oddNumber = mutableSetOf(1,3,5,7) // mutable
    oddNumber.add(9)


    println(oddNumber)

    // removing duplicates
    val newData = data.toSet().toMutableList()
    println(newData)

    // Map - key -value

    val contacts = mutableMapOf<String, Int>( "merry" to 10, Pair("robert", 333))

    contacts["john"] = 111
    contacts["john"] = 222
    println(contacts)

    for (x in contacts){
        println("${x.key} contact number: ${x.value}")
    }

    for (x in contacts.keys){
        println("Name: $x")
    }

    // collection operations

    val listOfNum = listOf(1,2,3,4,5,6,7,8,9,10)

    println("List: $listOfNum")
    // even numbers
    val evenList = listOfNum.filter { num ->
        num % 2 == 0
    }

    println("Even: $evenList")

    // transforming collection - map
    val sqrList = listOfNum.map {
        it * it
    }

    println("Squares : $sqrList")

    // reduce
    val product = listOfNum.reduce { arg1, arg2 ->
        arg1 * arg2
    }

    println("Cumulative product: $product")

    // fold
    val product2 = listOfNum.fold(10){arg1, arg2 ->
        arg1 * arg2

    }
    println("Cumulative product: $product2")
}