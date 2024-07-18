import org.example.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class InterListExtensionTest {

    @Test
    fun `should get the squares of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        val expectedSquare = BaseNodeList<Int>()
        expectedSquare.add(1)
        expectedSquare.add(4)

        val square = list1.getSquare()

        assertTrue { square.equals(expectedSquare.getList()) }
    }

    @Test
    fun `should get the cubes of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        val expectedCube = BaseNodeList<Int>()
        expectedCube.add(1)
        expectedCube.add(8)

        val cube = list1.getCube()

        assertTrue { cube.equals(expectedCube.getList()) }
    }

    @Test
    fun `should get the odd values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        list1.add(3)
        val expectedOdd = BaseNodeList<Int>()
        expectedOdd.add(1)
        expectedOdd.add(3)

        val odd = list1.getOdd()

        assertTrue { odd.equals(expectedOdd.getList()) }
    }

    @Test
    fun `should get the even values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        list1.add(3)
        val expectedEven = BaseNodeList<Int>()
        expectedEven.add(2)

        val even = list1.getEven()

        assertTrue { even.equals(expectedEven.getList()) }
    }

    @Test
    fun `should get the sum of  values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(2)
        list1.add(3)

        val sum = list1.getSum()

        assertEquals(6,sum)
    }

    @Test
    fun `should get the minimum of  values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(4)
        list1.add(2)
        list1.add(3)

        val minimum = list1.getMin()

        assertEquals(2,minimum)
    }

    @Test
    fun `should get the maximum of values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(4)
        list1.add(2)
        list1.add(3)

        val maximum = list1.getMax()

        assertEquals(4,maximum)
    }

    @Test
    fun `should get n repeating values of the list`() {
        val list1 = BaseNodeList<Int>()
        list1.add(1)
        list1.add(3)

        val expected = BaseNodeList<Int>()
        expected.add(1)
        expected.add(3)
        expected.add(3)
        expected.add(3)

        val result = list1.getRepeatingN()

        assertTrue { result.equals(expected.getList()) }
    }

}