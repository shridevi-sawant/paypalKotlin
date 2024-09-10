package com.paypal.kotlinlearning

// cannot inherite
// toString
data class Point(var x: Int, var y: Int)



fun main() {
    val p1 = Point(10, 10)
    println(p1)

    // scoping functions - readable,compact
    // let, run, with, apply, also

    var name: String? = "john"


    // let, run -> nullable
    // reference by 'it'
    name?.let {
        println("Count: ${it.length}")
        println("Uppered: ${it.uppercase()}")

    }

    // reference by 'this'
    name?.run {
        println("Count: ${length}")
        println("Uppered: ${this.uppercase()}")
    }

    // with - non-nullable
    println("x: ${p1.x}")

    with(p1){
        println("X - $x, Y - $y")

    }

    // apply, also - Constructing an object

    val data = IntArray(4)
    data[0] = 10
    data[1] = 20
    data[2] = 30
    data[3] = 40

    println(data.contentToString())

    val anotherData = IntArray(4).apply {
        // reference by 'this'
        this[0] = 10
        this[1] = 20
        this[2] = 30
        this[3] = 40

    }.also {
        // reference by 'it'
        println(it.contentToString())
    }

}