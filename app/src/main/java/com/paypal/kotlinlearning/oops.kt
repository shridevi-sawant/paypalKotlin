package com.paypal.kotlinlearning

// primary constructor - one
// secondary constructors - many

class Student(val name: String,
              val rollNo: Int) {
    // data/properties

    var marks: Int = 0
    // computed property
    var percentage: Double
        get() {
            return marks / 100.0
        }
        set(value) {
            marks = (value * 100).toInt()

        }

    //secondary
    constructor(name: String, rNo: Int, marks: Int) : this(name, rNo) {
        this.marks = marks
    }

    init {
        println("init executed for $name")
    }

    // methods
    fun display(){
        println("Name: $name")
        println("RollNo: $rollNo")
        println("Marks: $marks")
    }

    // Any - superclass
    override fun toString(): String {
        return "$name, $rollNo"
    }

}

fun main() {
    val std1 = Student("john", 1)
    std1.marks = 90

    std1.display()

    val std2 = Student("merry", 2)
    std2.display()

    val std3 = Student("robert", 3, 78)
    std3.display()

    println(std3)

    val p = std3.percentage // get
    std3.percentage = 78.3 // set
}