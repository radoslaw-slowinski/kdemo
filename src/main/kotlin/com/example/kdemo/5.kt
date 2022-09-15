package com.example.kdemo

object Utils {
    fun handyFunction(a: Int, b: Int) = a + b
}


class Bike {

    val heavyCalculationResult by lazy { 2 + 3 }



    companion object {
        const val WHEEL_SIZE = 16
    }
}

typealias customName = List<String>


data class Person(val first: String, val last: String = "some random last name")




fun main() {
    val peter = Person("Peter", "Parker")

    println(peter)
    println(peter.first)
    println(peter.component2())

    val car = Car();
    car.color = "RED"

}
