package com.tw.codher.kotlin.codher01

const val pizzaName = "DomzPizzaHut"

class PizzaVar {
    // var -> variable -> mutable
    // val -> value -> immutable
    val sauce: Double = 10.5
    var base = "PLAIN"

    var isBaked = false

    var toppings: List<String> = emptyList()
//
//    var pizzaType: String = "INDIAN"
}

fun main() {

    val newPizza = PizzaVar()
    newPizza.base = "THIN_CRUST"
    println("Sauce qty: ${newPizza.sauce}ml")
    println("Base is: ${newPizza.base}ml")

//    println("Vanakkam Kotlin !")
}

// Hand-on: I would like to mention the pizza type as Mexican,Italian,Indian
// I want the default to be Italian
// Print default value + change the pizza type to Mexican and print