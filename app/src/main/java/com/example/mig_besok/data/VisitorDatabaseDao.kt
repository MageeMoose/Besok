package com.example.mig_besok.data

import androidx.room.*
import com.example.mig_besok.model.Visitor
import kotlinx.coroutines.flow.Flow

@Dao
interface VisitorDatabaseDao {

    @Query("SELECT * FROM visitor_tbl")
    fun getVisitors() : Flow<List<Visitor>>

    @Query("SELECT * from visitor_tbl where id = :id")
    suspend fun getVisitorById(id: String): Visitor

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(visitor: Visitor)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update (visitor: Visitor)

    @Query("DELETE from visitor_tbl")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteVisitor(visitor: Visitor)



}