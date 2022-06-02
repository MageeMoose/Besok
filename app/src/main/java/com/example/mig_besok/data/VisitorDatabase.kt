package com.example.mig_besok.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.mig_besok.model.Visitor
import com.example.mig_besok.utils.DateConverter
import com.example.mig_besok.utils.UUIDConverter


@Database(entities = [Visitor::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class VisitorDatabase : RoomDatabase() {
    abstract fun visitorDao(): VisitorDatabaseDao

}