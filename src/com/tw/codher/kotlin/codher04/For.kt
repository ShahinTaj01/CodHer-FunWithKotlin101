package com.tw.codher.kotlin.codher04

private class Pizza

fun main() {
    makePizza(count = 10)
}

fun makePizza(count: Int = 1) {
    val pizzas = listOf("INDIAN", "MEXICAN", "ITALIAN")
    for(pizzaType in pizzas) {
        println("Making $pizzaType Pizza")
    }
    for(i in 0 until count){
        println("Making Pizza $i")
    }
    for(i in 0..count){
        println("Making Pizza $i")
    }
    for(i in 0 until count step 3){
        println("Making Pizza $i")
    }
}
// * downTo