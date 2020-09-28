package com.tw.codher.kotlin.codher01

private class PizzaGetSet {
    // var -> variable -> mutable
    // val -> value -> immutable
    var sauce: Double = 10.5

    var size = "REGULAR"
    set(value){
        field = value
        if(size == "REGULAR")
            sauce = 10.5
        else if(size == "MEDIUM")
            sauce = 12.5
        else if(size == "LARGE")
            sauce = 14.5
        else{
            field = "ERROR!"
            sauce = 0.0
        }
    }

    var base = "PLAIN"

    var isBaked = false

    var toppings: List<String> = emptyList()

    var pizzaType: String = "INDIAN"

    val pizzaShortDesc: String
    get() = "${base}_${pizzaType}_${size}"
}

fun main() {

    val newPizza = PizzaGetSet()

    println("Sauce qty: ${newPizza.sauce}ml")
    println("Size is: ${newPizza.size}")

    newPizza.size = "MEDIUM"

    println("Sauce qty: ${newPizza.sauce}ml")
    println("Size is: ${newPizza.size}")
//    println("Vanakkam Kotlin !")
}