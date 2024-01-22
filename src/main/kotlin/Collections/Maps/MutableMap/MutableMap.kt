private var mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")

fun main() {
    // putAll
    mutableMap.putAll(mapOf(6 to "six", 7 to "seven"))
    check("putAll")
    init()

    // remove
    mutableMap.remove(1)
    check("remove")
    init()

    // 指定されたキーと値のペアが揃っている場合のみ削除
    mutableMap.remove(2, "two")
    mutableMap.remove(3, "four")
    check("remove")
    init()

    // set
    mutableMap.set(1, "ONE")
    mutableMap.set(6, "ISX")
    check("set")
    init()
}

fun check(str: String) {
    println("${str}=${mutableMap}")
}

fun init() {
    mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
}