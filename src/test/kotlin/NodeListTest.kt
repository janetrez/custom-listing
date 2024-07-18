import org.example.BaseNodeList
import org.example.getSquare
import org.example.map
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NodeListTest {

    @Test
    fun `should create a list of integers`() {
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
    fun `should get the size of a list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)

        assertEquals(2, list1.getSize())
    }

    @Test
    fun `should delete n integers from the list`() {
        val list = BaseNodeList<Int>()
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        val expected = BaseNodeList<Int>()
        expected.add(4)
        expected.add(5)

        list.drop(2)

        assertTrue { expected.equals(list) }
    }

    @Test
    fun `should get n integers from the list`() {
        val list = BaseNodeList<Int>()
        list.add(2)
        list.add(3)
        list.add(4)
        list.add(5)

        val expected = BaseNodeList<Int>()
        expected.add(2)
        expected.add(3)
        expected.add(4)

        list.take(3)

        assertTrue { expected.equals(list) }
    }

}