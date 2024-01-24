## 参考
- https://kotlinlang.org/docs/scope-functions.html#takeif-and-takeunless
- https://qiita.com/ngsw_taro/items/d29e3080d9fc8a38691e

## Scope Function
- let
  - 引数をitで受け取る 
  - 最後の式を返す
  - セーフコールと合わせることでnullチェックを行うことができる
  - - レシーバをitとして参照できるが、名前をつけることも可能
- with
  - 引数をthisで受け取る
  - thisは省略可能
  - 最後の式を返す
- run
  - 引数をthisで受け取る
  - thisは省略可能
  - 最後の式を返す
- apply
  - 引数をthisで受け取る
  - thisは省略可能
  - 内側と外側のthisが異なるため、@~とする必要がある
  - レシーバを返す
- also
  - 引数をitで受け取る
  - レシーバを返す
  - レシーバをitとして参照できるが、名前をつけることも可能