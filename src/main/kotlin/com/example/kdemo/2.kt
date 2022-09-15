package com.example.kdemo

fun main() {

    for(x in 1..10) {
        println(x)
    }
    println("------")

    for(x in 1 until 10) {
        println(x)
    }
    println("------")

    for(x in 1..10 step 2) {
        println(x)
    }
    println("------")

    for(x in 10 downTo 1) {
        println(x)
    }
    println("------")

    
    for(x in 10 downTo 1 step 2) {
        println(x)
    }
    println("------")

    val names = listOf("Jack", "Jill", "Tom", "Kate")

    for(name in names) {
        println(name)
    }

}