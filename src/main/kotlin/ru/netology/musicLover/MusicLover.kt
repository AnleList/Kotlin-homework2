package ru.netology.musicLover

fun main() {
    val previousPurchaseAmount = 101_00.00
    val currentPurchaseAmount = 1000_00.00
    val isUserMusicLover = false

    val discountExcludingIsUserMusicLover = if (previousPurchaseAmount <= 1000_00) {
        0.0
    } else if ((previousPurchaseAmount in 1001_00.00..10000_00.00)) {
        100_00.00
    } else {
        currentPurchaseAmount * 0.05
    }

    val newPurchaseCostExcludingIsUserMusicLover = currentPurchaseAmount -
            discountExcludingIsUserMusicLover

    val discountIncludingIsUserMusicLover = if (isUserMusicLover) {
        newPurchaseCostExcludingIsUserMusicLover * 0.01
    } else {
        0.0
    }

    val finalDiscount = (discountExcludingIsUserMusicLover + discountIncludingIsUserMusicLover) / 100

    val newPurchaseCostIncludingIsUserMusicLover = (newPurchaseCostExcludingIsUserMusicLover -
            discountIncludingIsUserMusicLover) / 100

    println("Вы выбрали товаров на " + String.format("%.2f", currentPurchaseAmount / 100) + " ₽.")

    if (finalDiscount != 0.0) {
        println("Ваша скидка: " + String.format("%.2f", finalDiscount) + " ₽.")
    } else println("К большому сожалени, у вас пока нет скидок.")

    println(
        "Итоговая стоимость вашей покупки: " +
                String.format("%.2f", newPurchaseCostIncludingIsUserMusicLover) + " ₽."
    )
}