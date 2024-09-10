package com.paypal.kotlinlearning

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // create coroutine - builders - launch, async, runBlocking, withContext

    runBlocking {
        // fire and forget
        val uploadJob = launch(Dispatchers.Default) {
            uploadImage()

        }

        uploadJob.cancel()

        // collecting data
        val defResult = async(Dispatchers.Unconfined) {
            download()
        }

        val path = defResult.await()
        println("Downloaded data available at : $path")
        if (uploadJob.isActive)
            uploadJob.join() // job finished


        println("Task done")
    }
}

suspend fun uploadImage(){
    // network call
    println("uploading started..${Thread.currentThread().name}")
    delay(5000)
    //Thread.sleep(5000) // blocking
    println("uploading done")
}

suspend fun download() : String {
    println("download started..${Thread.currentThread().name}")
    delay(5000)
    //Thread.sleep(5000) // blocking
    println("downloading done ${Thread.currentThread().name}")

    return "/home/xyz.png"
}