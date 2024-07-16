import org.example.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class StringListExtensionTest {

    @Test
    fun `should get the uppercase values`() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        val list2 = BaseNodeList<String>()
        list2.add("HELLO")
        list2.add("HAI")

        val upperString = list1.getUpper()

        assertTrue { upperString.equals(list2.getList()) }
    }

    @Test
    fun `should get the lowercase values`() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        val list2 = BaseNodeList<String>()
        list2.add("hello")
        list2.add("hai")

        val lowerString = list1.getLower()

        assertTrue { lowerString.equals(list2.getList()) }
    }

    @Test
    fun `should get only the 3 lettered words from the list `() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        val list2 = BaseNodeList<String>()
        list2.add("HAI")

        val expected = list1.get3LetterStrings()

        assertTrue { expected.equals(list2.getList()) }
    }

    @Test
    fun `should get the length of strings `() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        val expected = BaseNodeList<Int>()
        expected.add(5)
        expected.add(3)

        val result = list1.getStringLengths()

        assertTrue { result.equals(expected.getList()) }
    }

    @Test
    fun `should get the sum of the length of strings `() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        assertEquals(8, list1.getLengthSum())

    }

    @Test
    fun `should get the concatenated strings `() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("HAI")

        assertEquals("hello HAI", list1.getConcat())

    }


    @Test
    fun `should get the first letter of strings `() {
        val list1 = BaseNodeList<String>()
        list1.add("hello")
        list1.add("bye")

        assertEquals("hb", list1.getFirstLetterWord())

    }


}