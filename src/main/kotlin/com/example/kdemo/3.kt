package com.example.kdemo

fun main() {
    fun receive1(name: String?) {
        //println(name.length) //ERROR

        if (name != null)
            println("Size is ${name.length}")
        else
            println("Size is 0")
    }

    fun receive2(name: String?) {
        println("Size is ${name?.length ?: 0}")
    }

    receive1(name = "Joe")
    receive1(name = null)

    receive2(name = "Joe")
    receive2(name = null)
}