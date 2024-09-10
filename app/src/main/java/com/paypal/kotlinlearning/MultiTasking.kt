package com.paypal.kotlinlearning

import kotlin.concurrent.thread

fun main() {

    val t1 = thread(name = "downloadThread") {
        println("Thread: ${Thread.currentThread().name}")
        println("t1 executing download task")
        Thread.sleep(2000)
        println("completed")

    }


    t1.join() // waiting for thread to finish
    println("DONE")


}