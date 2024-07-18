import org.example.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ListExtensionTest {
    @Test
    fun `should return the square of integers using the map function`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)

        val expected = BaseNodeList<Int>()
        expected.add(1)
        expected.add(4)

        val result = list1.map {
            it * it
        }

        assertTrue {
            result.equals(expected)
        }

    }

    @Test
    fun `should return the length of string using the map function`() {
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
            result.equals(expected)
        }

    }

    @Test
    fun `should return only 3 lettered strings using the filter function`() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("hey")

        val expected = BaseNodeList<String>()
        expected.add("hey")

        val result = list1.filter {
            it.length == 3
        }

        assertTrue {
            result.equals(expected)
        }

    }

    @Test
    fun `should return only the even integers using the filter function`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(6)

        val expected = BaseNodeList<Int>()
        expected.add(6)

        val result = list1.filter {
            it % 2 == 0
        }

        assertTrue {
            result.equals(expected)
        }

    }

    @Test
    fun `should calculate the sum of integers using the fold function`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(6)

        val result = list1.fold(0) { a, b ->
            a + b
        }

        assertEquals(7,result)
    }

    @Test
    fun `should return the concatenated string using the fold function`() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("world")

        val result = list1.fold("") { a, b ->
            "$a$b "
        }
        print(result)

        assertEquals("hello world ",result)
    }

    @Test
    fun `should delete even integers from the list`(){
        val list = BaseNodeList<Int>()
        list.add(2)
        list.add(3)
        list.add(4)
        val expected = BaseNodeList<Int>()
        expected.add(3)

        list.dropWhile {
            it % 2 == 0
        }

        assertTrue { expected.equals(list) }
    }
}