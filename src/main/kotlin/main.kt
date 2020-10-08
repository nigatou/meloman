fun main() {
    offer(100.0, false)
    offer(34234.0, false)
    offer(100.0, true)
    offer(34234.0, true)
}

fun offer(amount: Double, client: Boolean) {
    var finalAMount = amount;

    if (1001 < amount && amount < 10000) {
        finalAMount -= 100.0;
    } else if (10001 < amount) {
        finalAMount *= 0.95
    }

    if (client) {
        finalAMount *= 0.99
    }

    println("Покупка - $amount рублей")
    println("Покупка со скидкой - $finalAMount рублей")
    println()
}