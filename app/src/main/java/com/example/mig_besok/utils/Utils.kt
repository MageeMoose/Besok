package com.example.mig_besok.utils

import java.text.SimpleDateFormat
import java.util.*

fun fromDate(time:Long): String{
    val date = Date(time)
    val format = SimpleDateFormat("EEE d MMM hh:mm aaa", Locale.getDefault())

    return format.format(date)
}