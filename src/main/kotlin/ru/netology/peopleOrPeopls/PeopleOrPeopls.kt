package ru.netology.peopleOrPeopls

fun main() {
    val likes = 5
    val resultWord = if (likes == 0) {
        "человек"
    }    else if (!(likes.toString().endsWith("1")) ||
        likes.toString().endsWith("11")) {
        "людям"
    }    else {
        "человеку"
    }

    println("Понравилось $likes $resultWord")
}