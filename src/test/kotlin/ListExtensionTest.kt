import org.example.BaseNodeList
import org.example.map
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ListExtensionTest {
    @Test
    fun `should return the square of integers using the map function`(){
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)

        val expected = BaseNodeList<Int>()
        expected.add(1)
        expected.add(4)

        val result = list1.map {
            it*it
        }

        assertTrue {
            result.equals(expected.getList())
        }

    }

    @Test
    fun `should return the length of string using the map function`(){
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("hey")

        val expected = BaseNodeList<Int>()
        expected.add(5)
        expected.add(3)

        val result = list1.map {
            it.length
        }

        assertTrue {
            result.equals(expected.getList())
        }

    }
}