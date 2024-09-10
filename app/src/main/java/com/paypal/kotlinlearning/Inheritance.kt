package com.paypal.kotlinlearning

/*
types of inheritances

    - Single
        A->B
    - multilevel
        A->B->C
    - multiple (Not supported)
        A,B->C
    - hierarchical
        A->B, A->C
 */

open class Employee(val name: String, val empId: Int, var salary: Int) {
     // instance property
    init {
        empCount++
    }

    open fun display(){
        println("Name: $name")
        println("ID: $empId")
        println("Salary: $salary")
    }

    // class level / static
    companion object{
        var empCount = 0

        fun displayCount(){
            println("Emp Count: $empCount")
        }
    }
}

class Developer(name:String, id: Int, salary: Int,
                var skill: String): Employee(name, id, salary) {

          override fun display(){
              super.display()
              println("Skill: $skill")
          }
}

fun main() {

    val emp1 = Employee("john", 1, 1000)
    val emp2 = Developer("merry", 2, 2000, "Kotlin")

    emp1.display()
    emp2.display()

    //println("Total count: ${Employee.empCount}")
    Employee.displayCount()

    val data = listOf<Any>(1,12.3, "john", 20, "merry")

    val intData = mutableListOf<Int>()
    for (element in data){


//        if (element is String){
//           println( element.uppercase())
//        }

        when (element){
            is Int -> {
                intData.add(element)
            }
            is String -> {
                (element as String).uppercase()
            }
        }
    }
}
