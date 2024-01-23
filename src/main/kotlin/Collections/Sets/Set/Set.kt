fun main() {
    val set = setOf(1, 2, 3, 4, 5)

    // contains
    println(set.contains(1))

    // containsAll
    println(set.containsAll(listOf(1, 2, 3)))

    // isEmpty
    println(set.isEmpty())

    // indices
    println(set.indices)

    // all
    println(set.all { it > 0 })

    // any
    println(set.any { it > 0 })

}