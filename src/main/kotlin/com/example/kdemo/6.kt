package com.example.kdemo

class Robot {
    val left = "Left"
    val right = "Right"
    val fast = "Fast"

    infix fun turns(direction: String) {
        println("turns $direction")
    }

    infix fun runs(speed: String) {
        println("runs $speed")
    }

    operator fun plus(s: String) {
        val colorHere = Car().color

    }

}

fun operate(func: Robot.(theRobot: Robot) -> Unit) {
    val robot = Robot()

    robot + "2"


    robot.func(robot)
}

fun main() {

    operate { robot ->
        robot turns left
        robot turns right
        robot runs fast
    }

}
