package com.instagram.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.instagram.data.database.dao.UserDAO
import com.instagram.data.database.entities.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class BaseRoomDatabase : RoomDatabase() {
    abstract fun userDao(): UserDAO
}