import org.example.BaseNode
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BaseNodeTest {

    @Test
    fun `should create a node with given integer value`() {
        val node = BaseNode(5, null)
        assertEquals(5, node.value)
    }

    @Test
    fun `should create a node with given string value`() {
        val node = BaseNode("hello", null)
        assertEquals("hello", node.value)
    }


}