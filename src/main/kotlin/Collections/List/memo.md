## 参考
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/

## List
順序付きコレクション。
Listは読み取り専用のため、書き込みはできない。
（書き込みを行う場合はMutableListを使用する。）

### Properties
- size
  - リストのサイズをInt型で返す。

### Function
- contains
  - 指定された要素が、リスト内に含まれているかどうかをBoolean型で返す。
- containsAll
  - 指定されたコレクションがリスト内に全て存在するかどうかをBooleanで返す。
- get
  - 指定されたインデックスの要素を返す。
- indexOf
  - 指定された要素が一番最初に見つかるインデックスを返す。
  - 何も見つからない場合は-1を返す。
- iterator
  - リストをIteratorオブジェクトに変換して返す。
- isEmpty
  - コレクションが空かどうか判定。
  - 空である：true
  - 空ではない：false
- lastIndexOf
  - indexOfの最後を探すバージョン。
  - リスト内で指定された要素が最後に見つかるインデックスを返す。
  - 何も見つからない場合は-1を返す。
- listIterator
  - リストをListIteratorオブジェクトに変換して返す。
  - 引数にインデックスを指定することで、始まる位置を指定できる。
- subList
  - 指定された範囲を区切ったリストを返す。

## Extension Properties
- indices
  - リストの範囲をIntRangeで返す。
- lastIndex
  - リスト内の最後のインデックスを返す。

## Extension Functions
- all
  - 全ての要素が指定した条件に該当するか判定する。
  - 全て該当：true
  - 該当なしがある：false
- any
  - どれか一つの要素が指定した条件に該当するか判定する。
  - 一つでも該当：true
  - 該当なし：false
- asIterable
  - Iterableにして返す。
- asReversed
  - リストを反転して返す。
- asSequence
  - Sequenceとして返す。
- associate
  - リストの各要素をMapに変換する。
- associateTo
  - リストの各要素をMapに変換し、引数に指定したMapに入れる。
- associateBy
  - リストをキーとしたMapに変換する。
- associateByTo
  - リストをキーとしたMapに変換し、引数に指定したMapに入れる。
- associateWith
  - 要素をキーに、ラムダの結果をvalueに入れたMapを作る。
- associateWithTo
  - 要素をキーに、ラムダの結果をvalueに入れたMapを作り、引数に指定したMapに入れる。
- binarySearch
  - 指定した要素のインデックスを返返す。
