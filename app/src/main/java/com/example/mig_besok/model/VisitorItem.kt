package com.example.mig_besok.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity(tableName = "visitor_tbl")
data class VisitorItem(
    @PrimaryKey
    val id : UUID = UUID.randomUUID(),

    @ColumnInfo(name ="visitor_doss")
    val dossNumber: Int?,

    @ColumnInfo(name ="visitor_entryDate")
    val entryDate: Date = Date.from(Instant.now()),

    @ColumnInfo(name= "visitor_type1")
    val visitorType1: String,

    @ColumnInfo(name = "visitor_type2")
    val visitorType2: String?,

    @ColumnInfo(name="visitor_amount")
    val visitorAmount1: Int,

    @ColumnInfo(name= "visitor_amount2")
    val visitorAmount2: Int?,

    @ColumnInfo(name= "visitor_dateOut")
    val timeStampOut: Date = Date.from(Instant.now()),

    @ColumnInfo(name = "visitor_signIn")
    val signIn: String,

    @ColumnInfo(name="visitor_signOut")
    val signOut: String
)
