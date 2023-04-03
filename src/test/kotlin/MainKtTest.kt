import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionMir(){
        val result = calculateCommission( "mir", 100, 650000)

        assertEquals(50, result)
    }
    @Test
    fun calculateCommissionMaestro(){
        val result = calculateCommission("maestro",76000)
        assertEquals(4580, result)
    }
    @Test
    fun calculateCommissionVk(){
        val result = calculateCommission( purchaseAmount = 5000)
        assertEquals(0, result)
    }
    @Test
    fun calculateCommissionVisa(){
        val result = calculateCommission("visa",10000)
        assertEquals(750, result)
    }
    @Test
    fun calculateCommissionMastercard(){
        val result = calculateCommission("mastercard",10000)

        assertEquals(0, result)

    }
    @Test
    fun calculateCommissionLimit(){
        val result = calculateCommission(purchaseAmount = 20000)
        assertEquals(null, result)
    }
    @Test
    fun calcMain() {
        val result = main()
        assertEquals(Unit, result)
    }
}