import org.example.MathUtils
import org.junit.jupiter.api.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class HelloJunit5Test {

//    @Test
//    fun `First test`() {
//        print("Hello, JUnit5!")
//    }

    @ParameterizedTest(name = "{index}: {0} + {1} = {2}")
    @CsvSource(
        "-1374, -38, -1412",
        "-438, 0, -438",
        "-347, 483, 136",
        "0, 327, 327",
        "34, 69, 103",
        "0, 0, 0"
    )
    fun mathUnitTest(a: Int, b: Int, expected: Int) {
        val mathUtils = MathUtils()
        Assertions.assertEquals(expected, mathUtils.add(a, b))
    }
}