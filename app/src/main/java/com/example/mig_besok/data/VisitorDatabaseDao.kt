package com.example.mig_besok.data

import androidx.room.Dao
import androidx.room.Query
import com.example.mig_besok.model.Visitor
import kotlinx.coroutines.flow.Flow

@Dao
interface VisitorDatabaseDao {

    @Query("SELECT * FROM visitor_tbl")
    fun getVisitors() : Flow<List<Visitor>>

    @Query("SELECT * from visitor_tbl where id = :id")
    suspend fun getVisitorById(id: String): Visitor


}