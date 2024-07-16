import org.example.BaseNodeList
import org.example.getSquare
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NodeListTest {

    @Test
    fun `should create a list of integers`(){
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        list1.displayList()

        val list2 = BaseNodeList<Int>()
        list2.add(1)
        list2.add(2)

        assertTrue { list1.equals(list2) }

    }

    @Test
    fun `should get the size of a list`(){
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)

        assertEquals(2, list1.getSize())
    }


}