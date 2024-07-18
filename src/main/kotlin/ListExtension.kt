package org.example

fun <T, R> BaseNodeList<T>.map(fn: (T) -> R): BaseNodeList<R> {
    val result = BaseNodeList<R>()
    val list = this.getList()
    var temp = list.head
    while (temp != null) {
        result.add(fn(temp.value))
        temp = temp.next
    }
    return result
}

fun <T> BaseNodeList<T>.filter(fn: (T) -> Boolean): BaseNodeList<T> {
    val result = BaseNodeList<T>()
    val list = this.getList()
    var temp = list.head
    while (temp != null) {
        if (fn(temp.value))
            result.add(temp.value)
        temp = temp.next
    }
    return result
}

fun <T, R> BaseNodeList<T>.fold(initial: R, fn: (R, T) -> R): R {
    var result = initial
    val list = this.getList()
    var temp = list.head
    while (temp != null) {
        result = fn(result,temp.value)
        temp = temp.next
    }
    return result
}

