package ru.netology.homework2

fun main() {
    val amount = 1_000_00 //в копейках
    val normalCommissionPart = 0.0075
    val minimalCommissionValue = 35_00 //в копейках

    val commission = if (amount*normalCommissionPart <= minimalCommissionValue) minimalCommissionValue
        else amount*normalCommissionPart
    println("коммисия составит: ${commission.toInt()} копеек")
}
