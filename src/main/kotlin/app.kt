fun main() {
    while (true) {
        enter()
    }
}


fun enter(
    cardTest: String = "",
    sumManthTest: Int = 0,
    sumDayTest: Int = 0,

    ): Int {
    var test = 0

    val card = cardTest
    val sumManth = sumManthTest
    val sumDay = sumDayTest

//    val card :String
//    val sumDay: Int
//    val sumManth: Int


//    println(" Введите тип карты:")
//    println("1. Vk Pay")
//    println("2. Maestro")
//    println("3. MasterCard")
//    println("4. Visa")
//    println("5. Мир")

    //      card = readLine().toString()
    if (card.equals("Maestro") || card.equals("MasterCard ") ||
        card.equals("Visa") || card.equals("Мир") || card.equals(
            "Vk Pay"
        )
    ) {
        println("Введено верно")
        test = 1
    } else {
        println("Введено не верно")
        test = 2
    }
    println("введите сумму переводов в текущем месяце:")

    //       sumManth = readLine().toString().toInt()
    println("введите сумму совершаемого перевода:")
    //       sumDay = readLine().toString().toInt()

    if (limit(card = card, sumInManth = sumManth, transferCash = sumDay) == 0) {
        println(" Комиссия составляеьт ${cash(card, sumManth, sumDay)} копеек")
        test = 1
    }
    return test
}


fun cash(card: String, sumInManth: Int, transferCash: Int): Int {
    var sum = 0

    if (card.equals("Maestro") || card.equals("MasterCard ")) {
        if (sumInManth < 75000) {
            sum = 0
        } else {
            sum = ((transferCash / 100 * 0.6 + 20) * 100).toInt()
        }
    } else if (card.equals("Visa") || card.equals("Мир")) {
        if (transferCash >= (transferCash / 100 * 0.75)) {
            sum = ((transferCash / 100 * 0.75) * 100).toInt()
        }
    } else if (card.equals("Vk Pay")) {
        sum = 0
    }
    return sum
}


fun limit(card: String, sumInManth: Int, transferCash: Int): Int {
    var lim = 0
    if (card.equals("Vk Pay")) {
        if (transferCash > 15000) {
            println(
                "Ваша сумма больше 15000 рублей! " +
                        "Можно перевести не более 15000 рублей за один перевод"
            )
            lim = 1
        }
        if (sumInManth > 40000) {
            println(
                "Ваша сумма перевода больше 40000 рублей в месяц! " +
                        "Можно перевести не более 40000 рублей в месяц"
            )
            lim = 1
        }
    } else if (card.equals("Visa") || card.equals("Мир")) {
        if (transferCash <= 35) {
            println("Минимальная сумма перевода 35 рублей")
            lim = 1
        }
    } else {
        if (transferCash > 150000) {
            println("Вы привысили суточный лимит")
            lim = 1
        }
        if (sumInManth > 600000) {
            println("Вы привысили месячный лимит")
            lim = 1
        }

    }
    return lim
}