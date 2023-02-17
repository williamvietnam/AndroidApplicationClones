package com.instagram.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.instagram.data.database.entities.UserEntity

@Dao
interface UserDAO: BaseDAO<UserEntity> {

    @Query("SELECT * FROM userEntity")
    fun getAll(): List<UserEntity>

    @Insert
    fun insertAll(vararg userEntities: UserEntity)

    @Delete
    override fun delete(obj: UserEntity)

}