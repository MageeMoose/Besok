package com.example.mig_besok.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity(tableName = "visitor_tbl")
data class VisitorItem(
    @PrimaryKey
    val id : UUID = UUID.randomUUID(),
    val dossNumber: Int?,
    val entryDate: Date = Date.from(Instant.now()),
    val visitorType1: String,
    val visitorType2: String?,
    val visitorAmount1: Int,
    val visitorAmount2: Int?,
    val timeStampOut: Date = Date.from(Instant.now()),
    val signIn: String,
    val signOut: String
)
