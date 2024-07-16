import org.example.BaseNodeList
import org.example.getCube
import org.example.getSquare
import org.junit.jupiter.api.Test
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
        val expectedSquare = BaseNodeList<Int>()
        expectedSquare.add(1)
        expectedSquare.add(8)

        val square = list1.getCube()

        assertTrue { square.equals(expectedSquare.getList()) }
    }
}