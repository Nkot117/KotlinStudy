## 参考

https://runebook.dev/ja/docs/kotlin/api/latest/jvm/stdlib/kotlin.collections/-map/index

## Map

キーと値のペアを保持し、各キーに対する値の取得をサポートする。
キーは一意となる。
読み取り専用。

## Properties

- entries
    - マップの全てのキーと値をSetで返す。
- keys
    - 全てのキーをSetで返す。
- values
    - 全ての値をSetで返す。
- size
    - マップ内のペアの数を返す。

## Functions

- containsKey
    - 指定されたキーがマップ内に存在するか判定する。
- containsValue
    - 指定された値がマップ内に存在するか判定する。
- get
    - 指定されたキーに対応する値を返す。
    - キーが存在しない場合はnullを返す。
- getOrDefault
    - 指定されたキーに対応する値を返す。
    - キーが存在しない場合はデフォルト値を返す。
- isEmpty
    - マップが空か判定する。

## Extension Functions

- all
    - 全ての要素が条件を満たすか判定する。
- any
    - いずれかの要素が条件を満たすか判定する。
- asIterable
    - マップをIterableに変換する。
- asSequence
    - マップをSequenceに変換する。
- contains
    - 指定されたキーがマップ内に存在するか判定する。
- count
    - 条件を満たす要素の数を返す。
- filter
    - 条件を満たす要素のみを含むマップを返す。
- filterKeys
    - 条件を満たすキーのみを含むマップを返す。
- filterValues
    - 条件を満たす値のみを含むマップを返す。
- filterNot
    - 条件を満たさない要素のみを含むマップを返す。
- firstNotNullOf
    - transform 関数をこの文字列シーケンスの文字に適用して得られる最初の非 null 値を返す。
    - この関数は、transform が null を返す場合に例外をスローする。
- firstNotNullOfOrNull
    - transform 関数をこの文字列シーケンスの文字に適用して得られる最初の非 null 値を返す。
    - この関数は、transform が null を返す場合に null を返す。
- flatMap
    - 各要素に対して変換関数を適用し、結果をリストにして返す。
- forEach
    - 各要素に対して指定されたアクションを実行する。
- getOrElse
    - 指定されたキーに対応する値を返す。
    - キーが存在しない場合は、指定された関数を実行し、その結果を返す。
- getValues
    - 指定されたキーに対応する値を返す。
    - キーが存在しない場合はnullを返す。
- isNotEmpty
    - マップが空でないか判定する。
- isNullOrEmpty
    - マップがnullか空か判定する。
- map
  - 各要素に対して変換関数を適用し、結果をリストにして返す。
- mapKeys
  - 各要素に対して変換関数を適用し、結果をマップにして返す。
- mapNotNull
  - 各要素に対して変換関数を適用し、結果をリストにして返す。
  - 変換関数がnullを返す場合は除外する。
- mapValues
  - 各要素に対して変換関数を適用し、結果をマップにして返す。
- maxOf
  - 指定された関数を適用した結果の最大値を返す。
- minOf
  - 指定された関数を適用した結果の最小値を返す。
- minus
  - 指定されたキーに対応する値を除いたマップを返す。
- none
  - 条件を満たす要素が存在しないか判定する。
- onEach
  - 各要素に対して指定されたアクションを実行し、マップを返す。
- onEachIndexed
  - 各要素に対して指定されたアクションを実行し、マップを返す。
- orEmpty
  - nullの場合は空のマップを返す。
- plus
  - 指定されたキーと値を追加したマップを返す。
- toList
  - マップをリストに変換する。
- toSortedMap
  - マップをソート済みマップに変換する。
- withDefault
  - デフォルト値を指定してマップを返す。