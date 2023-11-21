package com.vahid.mystockmarketapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [CompanyListingEntity::class], version = 1, exportSchema = false)
abstract class StockDataBase : RoomDatabase() {
    abstract val dao: StockDao
}