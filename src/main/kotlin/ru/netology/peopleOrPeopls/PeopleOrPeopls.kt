package ru.netology.peopleOrPeopls

fun main() {
    val likes = 21
    val resultWord = if (likes == 0) {
        "человек"
    }    else if (!(likes.toString()).endsWith("1") || likes == 11) {
        "людям"
    }    else {
        "человеку"
    }

    println("Понравилось $likes $resultWord")
}