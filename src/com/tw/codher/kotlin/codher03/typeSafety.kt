package com.tw.codher.kotlin.codher03

private class PizzaTypeSafety {
    // var -> variable -> mutable
    // val -> value -> immutable

    var sauce: Double = 10.5

    var base: String? = null

    var isBaked = false

    var pizzaType: String = "INDIAN"

    //mozzarella, provolone, cheddar and Parmesan
    var cheeseType: String? = null

    var toppings: List<String> = emptyList()

    val pizzaShortDesc: String
        get() = "${base}_${pizzaType}_${size}"

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

    fun bake(size: String, pizzaType: String, base: String = "PLAIN", cheeseType: String? = "MOZARELLA") : Boolean {
        this.size = size
        this.pizzaType = pizzaType
        this.base = base
        this.cheeseType = cheeseType
        isBaked = true
        return isBaked
    }
}

fun main() {
    val newPizza = PizzaTypeSafety()
    newPizza.bake("MEDIUM", "MEXICAN", base = "THINCRUST")
    println("Your Chesse type is: ${newPizza.cheeseType}")
    newPizza.bake(pizzaType = "MEXICAN", cheeseType = null, size = "MEDIUM")
    println("Your new Cheese type is: ${newPizza.cheeseType}")
}

// !!
// ?.
// ?: