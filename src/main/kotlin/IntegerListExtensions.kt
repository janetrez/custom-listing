package org.example


fun BaseNodeList<Int>.getSquare(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
        list.add(temp.value * temp.value)
        temp = temp.next
    }
    return list
}

fun BaseNodeList<Int>.getCube(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
        list.add(temp.value * temp.value * temp.value)
        temp = temp.next
    }
    return list
}