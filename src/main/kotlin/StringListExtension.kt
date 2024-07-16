package org.example


fun BaseNodeList<String>.getUpper(): BaseNodeList<String> {
    val list = BaseNodeList<String>()
    var temp = this.head
    while (temp != null) {
        list.add(temp.value.uppercase())
        temp = temp.next
    }
    return list
}

fun BaseNodeList<String>.getLower(): BaseNodeList<String> {
    val list = BaseNodeList<String>()
    var temp = this.head
    while (temp != null) {
        list.add(temp.value.lowercase())
        temp = temp.next
    }
    return list
}

fun BaseNodeList<String>.get3LetterStrings(): BaseNodeList<String> {
    val list = BaseNodeList<String>()
    var temp = this.head
    while (temp != null) {
        if(temp.value.length == 3)
            list.add(temp.value)
        temp = temp.next
    }
    return list
}

fun BaseNodeList<String>.getStringLengths(): BaseNodeList<Int> {
    val list = BaseNodeList<Int>()
    var temp = this.head
    while (temp != null) {
            list.add(temp.value.length)
        temp = temp.next
    }
    return list
}

fun BaseNodeList<String>.getLengthSum(): Int {
    var sum = 0
    var temp = this.head
    while (temp != null) {
        sum += temp.value.length
        temp = temp.next
    }
    return sum
}

fun BaseNodeList<String>.getConcat(): String {
    var str = ""
    var temp = this.getList().head
    while (temp != null) {
        str += temp.value + " "
        temp = temp.next
    }
    return str.trim()
}

fun BaseNodeList<String>.getFirstLetterWord(): String {
    var str = ""
    var temp = this.getList().head
    while (temp != null) {
        str += temp.value[0]
        temp = temp.next
    }
    return str
}

fun BaseNodeList<String>.getWords(): BaseNodeList<String> {
    val list = BaseNodeList<String>()
    var temp = this.getList().head
    while (temp != null) {
        for (i in temp.value.split(" "))
            list.add(i)
        temp = temp.next
    }
    return list
}

