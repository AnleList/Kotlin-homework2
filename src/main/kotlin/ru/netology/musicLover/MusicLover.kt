package ru.netology.musicLover

fun main() {
    val amountOfPreviousPurchases = 101_00.00 //копеек
    val currentPurchaseAmount = 98_00.00 //копеек
    val isUserMusicLover = true

    val discountExcludingIsUserMusicLover = if (amountOfPreviousPurchases <= 1000_00) {
        0.0
    } else if (amountOfPreviousPurchases in 1001_00.00..10000_00.00 &&
        currentPurchaseAmount >= 100) {
        100_00.00 //копеек
    } else if (amountOfPreviousPurchases in 1001_00.00..10000_00.00 &&
        currentPurchaseAmount < 100) {
        currentPurchaseAmount //копеек
    } else {
        currentPurchaseAmount * 0.05 //копеек
    }

    val newPurchaseCostExcludingIsUserMusicLover = currentPurchaseAmount -
            discountExcludingIsUserMusicLover //копеек

    val discountIncludingIsUserMusicLover = if (isUserMusicLover) {
        newPurchaseCostExcludingIsUserMusicLover * 0.01 //копеек
    } else {
        0.0
    }

    val finalDiscount = (discountExcludingIsUserMusicLover +
            discountIncludingIsUserMusicLover) / 100 //рублей

    val newPurchaseCostIncludingIsUserMusicLover = (newPurchaseCostExcludingIsUserMusicLover -
            discountIncludingIsUserMusicLover) / 100 //рублей

    println(
        "Вы выбрали товаров на " +
                "%.2f".format(currentPurchaseAmount / 100) + " ₽."
    )

    if (finalDiscount != 0.0) {
        println("Ваша скидка: " + "%.2f".format(finalDiscount) + " ₽.")
    } else
        println("К большому сожалению, у вас пока нет скидок.")

    println(
        "Итоговая стоимость вашей покупки: " +
                "%.2f".format(newPurchaseCostIncludingIsUserMusicLover) + " ₽."
    )
}