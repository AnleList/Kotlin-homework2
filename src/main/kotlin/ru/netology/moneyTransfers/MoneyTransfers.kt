package ru.netology.moneyTransfers

fun main() {
    val amount = 1_000_00 //в копейках
    val normalCommission = amount*0.0075
    val minimalCommission = 35_00 //в копейках

    val commission = if (normalCommission <= minimalCommission) minimalCommission else normalCommission

    println("коммисия составит: ${commission.toInt()} копеек")
}
