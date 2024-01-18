package org.example.Collections.MutableList

fun main() {
    val mutableList = mutableListOf(1,2,3,4,5,6,7,8,9)

    // add
    mutableList.add(10)
    println("add=${mutableList}")

    // addAll
    mutableList.addAll(listOf(11,12,13))
    println("addAll=${mutableList}")

    // clear
    mutableList.clear()
    println("clear=${mutableList}")
}