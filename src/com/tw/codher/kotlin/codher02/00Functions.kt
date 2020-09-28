package com.tw.codher.kotlin.codher02
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

    var base = ""

    var isBaked = false

    var toppings: List<String> = emptyList()

    var pizzaType: String = "INDIAN"

    val pizzaShortDesc: String
        get() = "${base}_${pizzaType}_$size"

    fun bake(size: String, pizzaType: String, base: String = "PLAIN") : Boolean {
        this.size = size
        this.pizzaType = pizzaType
        this.base = base
        isBaked = true
        return isBaked
    }
}

fun main() {
    val newPizza = PizzaGetSet()
    newPizza.bake("MEDIUM", "MEXICAN", base = "THINCRUST")
    println("Your Pizza base is: ${newPizza.base}")
    newPizza.bake("MEDIUM", "MEXICAN")
    println("Your new Pizza base is: ${newPizza.base}")
}