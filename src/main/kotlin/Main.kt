fun main(args: Array<String>) {
    val buyAmount: Int = 20000
    val firstDiscount: Int = 100
    val regularKlient: Boolean = true
    var totalPrice: Int = buyAmount
    if (buyAmount in 1001..10000) totalPrice -= 100
    if (buyAmount > 10000) totalPrice -= totalPrice * 5 / 100
    if (regularKlient) totalPrice -= totalPrice * 1 / 100


    println("Итоговая сумма покупки: $totalPrice")
}