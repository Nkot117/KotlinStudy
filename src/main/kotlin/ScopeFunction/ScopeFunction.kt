fun main() {
    val mutableList: MutableList<Int>? = mutableListOf(1, 2, 3)

    // let
    // セーフコール演算子を使っているので、mutableListがnullの場合は実行されない
    mutableList?.let {
        it.add(4)
        // エルビス演算子と組み合わせてnullの場合の処理を書くこともできる
    } ?: println("mutableList is null")

    // with
    // withはレシーバーを引数に取る関数を呼び出す
    if (mutableList != null) {
        val a = with(mutableList) {
            this.add(5)
            // thisは省略できる
            add(6)
            // 最後の式が返り値になる
            "finish"
        }
        println(a)
    }

    // run
    // runはレシーバーを引数に取る関数を呼び出す
    if (mutableList != null) {
        // withと同じ感じだが、拡張関数として呼び出すことができる
        mutableList.run {
            this.add(7)
            // thisは省略できる
            add(8)
        }
    }

    mutableList?.run {
        add(9)
        // エルビス演算子と組み合わせてnullの場合の処理を書くこともできる
    } ?: println("mutableList is null")


    // apply
    // applyはレシーバーを引数に取る関数を呼び出す
    if (mutableList != null) {
        // withと同じ感じだが、拡張関数として呼び出すことができる
        val b = mutableList.apply {
            this.add(10)
            // thisは省略できる
            add(11)
            // レシーバーが返り値になるため、以下は返らない
            "finish"
        }

        println(b)
    }

    // also
    // alsoはレシーバーを引数に取る関数を呼び出す
    val c = mutableList?.also { mutableList ->
        mutableList.add(12)
        // レシーバーが返り値になるため、以下は返らない
        "finish"
    }
    println(c)
}