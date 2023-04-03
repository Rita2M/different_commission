fun main(){
       calculateCommission(purchaseAmount = 70000)

}

fun calculateCommission(cardType: String = "VK Pay", purchaseAmount: Int, purchaseAmountMonth: Int = 0): Int? {
    val commissionRate = when (cardType) {
        "mastercard", "maestro" -> if (purchaseAmount >= 75000) (0.06 * purchaseAmount) + 20 else 0
         "visa", "mir" -> if ((0.075 * purchaseAmount) < 35) 35 else purchaseAmount * 0.075
        else -> 0
    }
    return when {
        purchaseAmount > dailyLimit(cardType) || (purchaseAmountMonth + purchaseAmount) > monthlyLimit(cardType) -> null
        else -> commissionRate.toInt()
    }
}
fun dailyLimit(cardType: String) = when (cardType) {
    "VK Pay" -> 15000
    else -> 150000
}
fun monthlyLimit(cardType: String) = when (cardType) {
    "VK Pay" -> 40000
    else -> 600000
}

