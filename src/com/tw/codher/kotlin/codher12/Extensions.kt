package com.tw.codher.kotlin.codher12

//Welcome person with name
//1
fun String.welcome() = println("Vanakkam $this")

val String.welcomes: String
get() = "Hello $this"

//2
val List<Pizza>.spiciestPizzasName :String?
    get() = maxBy { pizza -> pizza.spicy }?.name

data class Pizza(val name: String, val spicy: Int = 2)

fun main() {
    val pizza1 = Pizza("Doms", 1)
    val pizza2 = Pizza("Pizut", 2)
    val pizza3 = Pizza("HomeMade", 3)

    val pizzas = listOf(pizza1, pizza2, pizza3)

    //Find name of the pizza which is most spicy
    println(pizzas.spiciestPizzasName)
    println("Joe".welcomes)

    1.add(2)
    3.mult(3)
}

private fun Int.mult(b: Int) = this * b

private fun Int.add(b: Int) = this + b

// Handson:
// Write an extension function to concat the list of string into a single string
// with a space
// Example: Input: ("check","it", "out!", "Extensions", "are", "fun!"
// Output: "Check it out! Extensions are fun!
