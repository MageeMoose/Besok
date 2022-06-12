package com.example.mig_besok.repository

import com.example.mig_besok.data.VisitorDatabaseDao
import com.example.mig_besok.model.Visitor
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class VisitorRepository @Inject constructor(private val visitorDatabaseDao: VisitorDatabaseDao) {
    suspend fun addVisitor(visitor: Visitor) = visitorDatabaseDao.insert(visitor)
    suspend fun updateVisitor(visitor: Visitor) = visitorDatabaseDao.update(visitor)
    suspend fun deleteVisitor(visitor: Visitor) = visitorDatabaseDao.deleteVisitor(visitor)
    fun getAllVisitors(): Flow<List<Visitor>> = visitorDatabaseDao.getVisitors()
}