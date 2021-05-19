import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


internal class MainKtTest {

    val calc = Calculadora()

    @Test
    fun main() {
    }

    @Test
    fun testSoma() {
        assertEquals(5, calc.somar(2, 3))
    }

    @Test
    fun testSubtrair() {
        assertEquals(3, calc.subtrair(7, 4))
    }

    @Test
    fun testMultiplicar() {
        assertEquals(18, calc.multiplicar(9, 2))
    }

    @Test
    fun testDividir() {
        assertEquals(5.0, calc.dividir(15.0, 3.0))
    }
}