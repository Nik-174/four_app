import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class AppKtTest {


    @Test
    fun main() {
        val result = enter()
        assertEquals(1, result)

    }

    @Test
    fun enterVisa() {
        val card = "Visa"
        val sumDay = 100000
        val sumManth = 100000

        val result = enter(card, sumManth, sumDay)
        assertEquals(1, result)
    }

    @Test
    fun enterV() {
        val card: String = "V"
        val sumDay: Int = 100000
        val sumManth: Int = 100000

        val result = enter(card, sumManth, sumDay)
        assertEquals(1, result)
    }

    @Test
    fun enterVkPay() {
        val card: String = "Vk Pay"
        val sumDay: Int = 100000
        val sumManth: Int = 100000

        val result = enter(card, sumManth, sumDay)
        assertEquals(1, result)
    }



    @Test
    fun cashMaestro() {
        val testCard = "Maestro"
        val testSum = 10000
        val testTransfer = 1000

        val result = cash(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(0, result)
    }

    @Test
    fun cashMasterCard() {
        val testCard = "MasterCard "
        val testSum = 110000
        val testTransfer = 100000

        val result = cash(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(62000, result)
    }

    @Test
    fun cashVisa() {
        val testCard = "Visa"
        val testSum = 10000
        val testTransfer = 10000

        val result = cash(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(7500, result)
    }

    @Test
    fun cashMir() {
        val testCard = "Мир"
        val testSum = 110000
        val testTransfer = 100000

        val result = cash(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(75000, result)
    }

    @Test
    fun cashVkPay() {
        val testCard = "Vk Pay"
        val testSum = 110000
        val testTransfer = 100000

        val result = cash(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(0, result)
    }



    @Test
    fun limitVkPay() {
        val testCard = "Vk Pay"
        val testSum = 1
        val testTransfer = 100000

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(1, result)
    }

    @Test
    fun limitVkPaySum() {
        val testCard = "Vk Pay"
        val testSum = 100000
        val testTransfer = 10

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(1, result)
    }

    @Test
    fun limitVisa() {
        val testCard = "Visa"
        val testSum = 100000
        val testTransfer = 10

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(1, result)
    }

    @Test
    fun limitMir() {
        val testCard = "Мир"
        val testSum = 100000
        val testTransfer = 100

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(0, result)
    }

    @Test
    fun limitTransfer() {
        val testCard = "Maestro"
        val testSum = 100000
        val testTransfer = 10000000

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(1, result)
    }

    @Test
    fun limitSum() {
        val testCard = "Maestro"
        val testSum = 100000000
        val testTransfer = 100

        val result = limit(
            card = testCard,
            sumInManth = testSum,
            transferCash = testTransfer
        )
        assertEquals(1, result)
    }
}