package org.example

fun <T, R> BaseNodeList<T>.map(fn: (T) -> R): BaseNodeList<R> {
    val result = BaseNodeList<R>()
    var temp = this.head
    while (temp != null) {
        result.add(fn(temp.value))
        temp = temp.next
    }
    return result
}

