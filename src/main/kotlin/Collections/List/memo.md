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
  - 指定した要素を二分探索アルゴリズムを使用して検索し、インデックスを返返す。
  - 実行にはリストがソートされている必要がある。
- chunked
  - リストを指定した数で区切ったリストに返す。
- count
  - 条件を満たした要素の数を返す。
- distinct
  - 要素の重複を削除したリストを返す。
- drop
  - 指定された数除外したリストを返す。
- dropLast
  - 後ろから指定された数除外したリストを返す。
- dropWhile
  - 指定した条件全てを除外したリストを返す。
- dropLastWhile
  - 後ろから指定した条件全てを除外したリストを返す。
- elementAt
  - 指定したインデックスの要素を返す。
  - 範囲外のインデックスを指定した場合はIndexOutOfBoundsExceptionが投げられる。
- elementAtOrElse
  - インデックスが範囲外の場合に返す値を指定できる。
- elementAtOrNull
  - インデックスが範囲外の場合はNullを返す。
- filter
  - 指定された条件を満たす要素をリストで返す。
- filterIndexed
  - index付きのfilter。
- filterIndexedTo
  - 返却値を引数のListに入れる。
- filterIsInstance
  - 条件がクラス。
- filterNot
  - 条件に該当しない要素をリストで返す。
- filterNotNull
  - nullを除外したリストを返す。
- find
  - 指定された条件に該当する初めの要素を返す。
- findLast
  - 指定された条件に該当する要素を最後尾から探して返す。
- first
  - 指定した条件を満たす最初の要素を返す。
  - 条件を満たす物がない場合はNoSuchElementExceptionを返す。
- firstOrNull
  - 条件に合致する要素がない場合 null を返す