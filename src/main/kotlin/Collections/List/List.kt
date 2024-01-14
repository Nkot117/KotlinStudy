package org.example.Collections.List

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // subList
    // subList(どこのidxから, どのidxの手前まで)
    val sub = list.subList(0, 3)
    // この場合だと、idxの0 ~ 3の手前まで
    // [0,1,2]
    println("subList=${sub}")

    // indices
    val indices = list.indices
    println("subList=${indices}")

    // lastIndex
    val last = list.lastIndex
    println("lastIndex=${last}")

    // all
    // 全て９以下か
    println("all=${list.all { it < 9 }}")

    // any
    // いずれかが９以下か
    println("any=${list.any { it < 9 }}")

    // asReversed
    val reversed = list.asReversed()
    println("asReversed=${reversed}")

    // asSequence
    // sequenceに変換することで、リスト内をシーケンスで処理できる
    val sequence = list.asSequence()

    // 要素を100倍し、初めて200を超えたものを返す
    // 一つずつ中間操作、終端操作を行っている
    val sequenceResult = sequence
        .map { println("map: $it"); it * 100 }
        .first { it > 200 }
    println(sequenceResult)

    // リストのままやった場合
    // 全て中間操作をやっ後に終端操作を行っている
    val listResult = list
        .map { println("map: $it"); it * 100 }
        .first { it > 200 }
    println(listResult)

    // associate
    println("associate=${list.associate { it to it * 10 }}")

    // associateTo
    val associateToMap = mutableMapOf<Int, Int>()
    list.associateTo(associateToMap) {
        it to it * 10
    }
    println("associateToMap${associateToMap}")

    // associateBy
    // キーだけ作る。値はそのまま入れる。
    println(
        "associateBy=${
            list.associateBy { it * 10 }
        }"
    )

    // associateByTo
    val associateByMap = mutableMapOf<Int, Int>()
    list.associateByTo(associateByMap) { it * 10 }
    println("associateByTo=${associateByMap}")

    // associateWith
    println("associateWith=${list.associateWith { it * 100 }}")

    // associateWithTo
    val associateWithMap = mutableMapOf<Int, Int>()
    list.associateWithTo(associateWithMap) { it * 100 }
    println("associateWithTo=${associateWithMap}")
}