package me.hyeonjae

import kotlin.test.Test

class KotlinTest {

    @Test
    fun createListByListOf() {
        val fruits = listOf("apple", "banana", "kiwifruit")
        for (fruit in fruits) println(fruit)
    }

    @Test
    fun testWhenExpression() {
        val a = "abc"
        val b = when (a) {
            "a" -> "one"
            "b" -> "two"
            "abc" -> "Ok"
            is String -> "Long"
            !is String -> "Not a string"
            else -> "unknown"
        }
        println(b)
    }
}