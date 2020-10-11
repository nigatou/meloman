fun main() {
    offer(100.0, 100000, true)
    offer(3434.0, 5000, false)
    offer(100.0, 10000, true)
    offer(34234.0, 15000, false)
}

fun offer(amount: Double, clientLastPurchase: Int, clientMeloman: Boolean) {
    var finalAMount = amount;

    if (clientLastPurchase in 1000..10000) {
        finalAMount -= 100.0;
    } else if (clientLastPurchase > 10001) {
        finalAMount *= 0.95
    }

    if (clientMeloman) {
        finalAMount *= 0.99
    }



    println("Покупка - ${amount.toString().split(".")[0]} рублей ${amount.toString().split(".")[1]} копеек")
    println("Покупка со скидкой - ${finalAMount.toString().split(".")[0]} рублей ${finalAMount.toString().split(".")[1]} копеек")
    println()
}