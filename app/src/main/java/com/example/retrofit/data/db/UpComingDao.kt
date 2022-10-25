package com.example.retrofit.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.data.model.upcomming.UpComing


@Dao
interface UpComingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUpcoming(artists : List<UpComing>)

    @Query("DELETE FROM upcoming_movies")
    suspend fun deleteAllUpcoming()

    @Query("SELECT * FROM upcoming_movies")
    suspend fun getUpcoming():List<UpComing>
}