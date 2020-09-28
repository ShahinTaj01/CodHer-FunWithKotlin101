package com.tw.codher.kotlin.codher04


private class PizzaWhen {

    // var -> variable -> mutable
    // val -> value -> immutable
    var sauce: Double = 10.5

    //1 being less, 3 being high
    var spicy: Int = 2

    //INDIAN, MEXICAN, ITALIAN, CONTINENTAL
    var pizzaType: String = "INDIAN"

    var base = ""

    var isBaked = false

    //mozzarella, provolone, cheddar and Parmesan
    var cheeseType: String? = null

    var toppings: List<String> = emptyList()

    val pizzaShortDesc: String
        get() = "${base}_${pizzaType}_${size}"

    var size = "REGULAR"
        set(value){
            field = value
            sauce = when (size) {
                "REGULAR" -> 10.5
                "MEDIUM" -> 12.5
                "LARGE" -> 14.5
                else -> {
                    field = "ERROR!"
                    0.0
                }
            }
        }

    fun bake(size: String, pizzaType: String, base: String = "PLAIN", cheeseType: String? = "MOZARELLA") : Boolean {
        this.size = size
        this.pizzaType = pizzaType
        this.spicy = if(pizzaType == "INDIAN") 3 else 2
        this.cheeseType = cheeseType ?: "NONE"
        this.base = base
        isBaked = true
        return isBaked
    }
}

fun main() {
    val newPizza = PizzaWhen()
    newPizza.bake("MEDIUM", "MEXICAN", base = "THINCRUST")
    println("Your Chesse type is: ${newPizza.cheeseType}")
    newPizza.bake(pizzaType = "MEXICAN", cheeseType = null, size = "MEDIUM")
    println("Your new Cheese type is: ${newPizza.cheeseType}")
}