fun main() {

    val sum = 15000
    var isMusicfan: Boolean = false

    val discountCost = if (sum >= 1001 && sum <= 10000) 100
    else if (sum <= 1000) 0
    else sum / 100 * 5

    val progressDiscount = if (isMusicfan == true && sum <= 1000) sum / 100 * 1
    else if(isMusicfan == true) (discountCost / 100 * 1) + discountCost
    else 0

    var totalRebate = discountCost + progressDiscount
    var totalSum = sum - totalRebate

    println("""Скидка $totalRebate рублей. Сумма $totalSum рублей""")
}