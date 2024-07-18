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
        for ( i in 1..count) {
            this.head = this.head?.next
        }
    }

}


