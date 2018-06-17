package com.luiztadeu.guiafinancas.extension

import java.text.SimpleDateFormat
import java.util.*

    fun Calendar.formataDateCalender(): String{
        return formataDateCalender("dd/MM/yy")
    }

fun Calendar.formataDateCalender(format: String): String{
    val stringFormat = SimpleDateFormat(format, Locale.getDefault())
    return stringFormat.format(this.time)
}