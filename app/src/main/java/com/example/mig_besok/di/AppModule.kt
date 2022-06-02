package com.example.mig_besok.di

import android.content.Context
import androidx.room.Room
import com.example.mig_besok.data.VisitorDatabase
import com.example.mig_besok.data.VisitorDatabaseDao

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

   @Singleton
   @Provides
   fun provideVisitorDao(visitorDatabase: VisitorDatabase): VisitorDatabaseDao = visitorDatabase.visitorDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) : VisitorDatabase
            = Room.databaseBuilder(
        context,
        VisitorDatabase::class.java,
        "visitor_db"

    ).fallbackToDestructiveMigration().build()
}