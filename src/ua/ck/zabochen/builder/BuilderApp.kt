package ua.ck.zabochen.builder

import ua.ck.zabochen.builder.java.FoodOrderJavaStyle
import ua.ck.zabochen.builder.kotlin.FoodOrderKotlinStyle

fun main(args: Array<String>) {
    val foodOrderJavaStyle: FoodOrderJavaStyle = FoodOrderJavaStyle.Builder()
            .setBread("Soft Bread")
            .setMeat("Hot Meat")
            .build()
    println(foodOrderJavaStyle.toString())

    val foodOrderKotlinStyle: FoodOrderKotlinStyle = FoodOrderKotlinStyle.Builder()
            .setBread("Soft Bread")
            .setMeat("Hot Meat")
            .build()
    println(foodOrderKotlinStyle.toString())
}