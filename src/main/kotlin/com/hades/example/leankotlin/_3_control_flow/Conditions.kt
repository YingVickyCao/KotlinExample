package com.hades.example.leankotlin._3_control_flow

fun main() {
    if_expression()
    when_expresion()
    for_loops()
    while_loops()
    break_in_loops()
    continue_in_loops()
}

fun if_expression() {
    // Only if
    run {
        val a = 10
        val b = 3
        var max: Int

        if (a < b) {
            max = b
        }

        if (a < b) max = b
    }

    // if - else
    run {
        val a = 10
        val b = 3
        var max: Int
        if (a < b) {
            max = b
        } else {
            max = a
        }
    }

    // if - else if expression
    run {
        val a = 10
        val b = 3
        var max: Int
        if (a < b) {
            max = b
        } else if (a == 20) {
            max = a
        }
//    println(max) // Compile Error : Variable 'max' must be initialized
    }

    // As expression
    run {
        val a = 10
        val b = 3
        var max: Int
        max = if (a > b) a else b
    }

    // Use if in expression
    run {
        val a = 10
        val b = 3
        val maxLimit = 1
        val max = if (maxLimit > a) maxLimit else if (a > b) a else b
        println(max) // 10
    }

    // Branches of an if expression can be blocks
    run {
        val a = 10
        val b = 3
        val max = if (a > b) {
            println("max is a=$a") // max is a=10
            a
        } else {
            println("max is b=$b")
            b
        }
        println(max) // 10
    }

}

//  similar to `Swith` in C-like language
fun when_expresion() {
}

fun for_loops() {

}

fun while_loops() {

}

fun break_in_loops() {

}

fun continue_in_loops() {

}