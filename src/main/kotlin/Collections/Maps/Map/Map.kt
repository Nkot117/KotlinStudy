import java.util.*

private val map = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
private val mapIncludingNull = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", null to null)

fun main() {
    // entries
    println("entries=${map.entries}")

    // keys
    println("keys=${map.keys}")

    // values
    println("values=${map.values}")

    // size
    println("size=${map.size}")

    // containsKey
    println("containsKey=${map.containsKey(1)}")

    // containsValue
    println("containsValue=${map.containsValue("two")}")

    // get
    println("get=${map.get(1)}")

    // getOrDefault
    println("getOrDefault=${map.getOrDefault(6, "six")}")

    // isEmpty
    println("isEmpty=${map.isEmpty()}")

    // all
    println("all=${map.all { it.key > 0 && it.value.length > 1 }}")

    // contains
    println("contains=${map.contains(1)}")

    // count
    println("count=${map.count { it.key > 3 }}")

    // filter
    println("filter=${map.filter { it.key > 3 }}")

    // filterKeys
    println("filterKeys=${map.filterKeys { it > 3 }}")

    // filterNot
    println("filterNot=${map.filterNot { it.key > 3 }}")

    // firstNotNullOf
    println("firstNotNullOf=${map.firstNotNullOf { it.key > 3 }}")

    // もし、nullがある場合は、NoSuchElementExceptionが発生する
    try {
        println("firstNotNullOf=${map.firstNotNullOf { null }}")
    } catch (e: NoSuchElementException) {
        println("firstNotNullOf=${e.message}")
    }

    // firstNotNullOfOrNull
    println("firstNotNullOfOrNull=${map.firstNotNullOfOrNull { it.key > 3 }}")

    // もし、nullがある場合は、nullが返る
    println("firstNotNullOfOrNull=${map.firstNotNullOfOrNull { null }}")

    // flatMap
    println("flatMap=${map.flatMap { listOf(it.key, it.value) }}")

    // forEach
    map.forEach { println("forEach=${it.key}=${it.value}") }

    // getOrDefault
    println("getOrDefault=${map.getOrDefault(6, "six")}")

    // getOrElse
    // もし、keyがない場合は、指定された関数を実行し、その結果を返す
    println("getOrElse=${map.getOrElse(6) { "6はマップにありません。" }}")

    // getValue
    println("getValues=${map.getValue(1)}")

    // isNotEmpty
    println("isNotEmpty=${map.isNotEmpty()}")

    // isNullOrEmpty
    println("isNullOrEmpty=${map.isNullOrEmpty()}")

    // map
    println("map=${map.map { it.value + it.key }}")

    // mapKeys
    println("mapKeys=${map.mapKeys { it.key + 1 }}")

    // mapNotNull
    println("mapNotNull=${mapIncludingNull.mapNotNull { it.value }}")

    // mapValues
    println("mapValues=${map.mapValues { it.value + it.key }}")

    // maxOf
    println("maxOf=${map.maxOf { it.key }}")

    // minOf
    println("minOf=${map.minOf { it.key }}")

    // minus
    println("minus=${map.minus(1)}")

    // none
    println("none=${map.none { it.key > 5 }}")

    // onEach
    // onEachは、元のmapを返す
    // forEachは、Unitを返すため、mapの中身を処理しつつ、何かを返したい場合は、onEachを使う
    val result = map.onEach { println("onEach=${it.key}=${it.value}") }
    println("onEach=${result.size}")

    // onEachIndexed
    println("onEachIndexed=${map.onEachIndexed { index, entry -> println("onEachIndexed=$index=${entry.key}=${entry.value}") }}")

    // orEmpty
    val nullMap: Map<Int, String>? = null
    println("orEmpty=${nullMap.orEmpty()}")

    // plus
    println("plus=${map.plus(6 to "six")}")

    // toList
    println("toList=${map.toList()}")

    // toMutableMap
    println("toMutableMap=${map.toMutableMap()}")

    // toSortedMap
    println("toSortedMap=${map.toSortedMap{ o1, o2 -> o2.compareTo(o1) }}")

    // withDefault
    val defaultMap = map.withDefault { "default" }
    println("withDefault=${defaultMap.getValue(1)}")
}
