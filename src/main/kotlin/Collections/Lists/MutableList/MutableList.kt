package org.example.Collections.Lists.MutableList

private val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

fun main() {
    // add
    mutableList.add(10)
    check("add")

    // addAll
    mutableList.addAll(listOf(11, 12, 13))
    check("addAll")

    // clear
    mutableList.clear()
    check("clear")
    init()

    // remove
    mutableList.remove(1)
    check("remove")
    init()

    // removeAll
    mutableList.removeAll(listOf(1, 2, 3))
    check("removeAll")
    init()

    // removeAt
    mutableList.removeAt(2)
    check("removeAt")
    init()

    // retainAll
    mutableList.retainAll(listOf(1,3,5))
    check("retainAll")
    init()

    // set
    mutableList.set(1,40)
    check("set")
    init()

    // replaceAll
    mutableList.replaceAll{it * 10}
    check("replaceAll")
    init()
}

fun init() {
    mutableList.clear()
    mutableList.addAll(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
}

fun check(str: String){
    println("${str}=$mutableList")
}