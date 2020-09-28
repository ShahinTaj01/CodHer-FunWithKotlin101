package com.tw.codher.kotlin.codher11

val sum = { a: Int, b: Int -> {
    val sum = a + b
    println("Sum of $a, $b is: $sum")
    sum
} }
val mult = { a: Int, b: Int -> {
    val mult = a * b
    println("Mult of $a, $b is: $mult")
    mult
} }

fun doMath(operation: () -> Int) {
    operation()
}

fun main() {
    doMath(sum(1,3))
    doMath(mult(1,3))
}