package org.example

class BaseNodeList<T> {
    var head : BaseNode<T>? = null

    fun add(value : T){
        this.head = BaseNode(value,head)
    }

    fun getList(): BaseNodeList<T> {
        val list = BaseNodeList<T>()
        var temp = head
        while(temp!=null){
            list.add(temp.value)
            temp = temp.next
        }
        return list
    }

    fun displayList(){
        var temp = head
        while(temp!=null){
            print(" ${temp.value} " )
            temp = temp.next
        }
    }
    fun getSize(): Int {
        var count = 0
        var temp = head
        while(temp!=null){
            count++
            temp = temp.next
        }
        return count
    }

    fun equals(list : BaseNodeList<T>) : Boolean{
        if(this.getSize()!=list.getSize())
            return false
        var temp = head
        var other = list.head
        while(temp!=null && other!=null){
            if (temp.value != other.value)
                return false
            temp = temp.next
            other = other.next
        }
        return true
    }

    fun drop(count : Int){
        if(this.getSize() < count)
            throw Exception("Count greater than list size")
        var list = this.getList()
        for ( i in 1..count) {
            list.head = list.head?.next
        }
        list = list.getList()
        this.head = list.head
    }

    fun take(count : Int){
        if(this.getSize() < count)
            throw Exception("Count greater than list size")
        var list = this.getList()
        this.head = null
        var temp = list.head
        for ( i in 1..count) {
            if (temp !=null){
                this.add(temp.value)
                temp = temp.next
            }
        }
    }

}


