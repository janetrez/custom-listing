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

fun BaseNodeList<Int>.getOdd(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
        if(temp.value % 2 !=0)
        list.add(temp.value)
        temp = temp.next
    }
    return list
}

fun BaseNodeList<Int>.getEven(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
        if(temp.value % 2 ==0)
            list.add(temp.value)
        temp = temp.next
    }
    return list
}

fun BaseNodeList<Int>.getSum(): Int {
    var sum = 0
    var temp = this.head
    while (temp != null) {
        sum += temp.value
        temp = temp.next
    }
    return sum
}

fun BaseNodeList<Int>.getMin(): Int {
    var min = Int.MAX_VALUE
    var temp = this.head
    while (temp != null) {
        if(temp.value < min)
            min = temp.value
        temp = temp.next
    }
    return min
}

fun BaseNodeList<Int>.getMax(): Int {
    var max = Int.MIN_VALUE
    var temp = this.head
    while (temp != null) {
        if(temp.value > max)
            max = temp.value
        temp = temp.next
    }
    return max
}

fun BaseNodeList<Int>.getRepeatingN(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
        for(i in 1..temp.value)
            list.add(temp.value)
        temp = temp.next
    }
    return list
}