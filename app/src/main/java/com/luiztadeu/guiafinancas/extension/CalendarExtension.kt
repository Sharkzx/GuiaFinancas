package com.luiztadeu.guiafinancas.extension

import java.text.SimpleDateFormat
import java.util.*

class CalendarExtension {

    fun Calendar.formatDateCalender(date: Calendar): String{
        return this.formatDateCalender("dd/MM/yy", date)
    }

    fun Calendar.formatDateCalender(format: String, date: Calendar): String{
        val stringFormat = SimpleDateFormat(format, Locale.getDefault())
        return stringFormat.format(date)
    }
}