package com.paypal.kotlinlearning

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main() {

    // Cold flow - produces value only if observed
    val numFlow = flow {
        // suspending block
        // flow builder
        (1..10).forEach {
            println("emitting $it, ${Thread.currentThread().name}")
            //publishing
            emit(it)
            delay(1000)
        }


    }.flowOn(Dispatchers.Default)

    //  transform data
    val squareFlow = numFlow.map{
        it * it
    }

    runBlocking {
        // observing the values
        launch(Dispatchers.Default) {
            squareFlow.collect {
                println("value: $it,  ${Thread.currentThread().name}")
            }
        }

        launch {
            listOf(10,20,30).asFlow().collect {
                println("element: $it")
            }
        }
    }



}