package com.example.retrofit.data.repository.upcoming.datasource

import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing


interface UpComingLocalDataSource {
    suspend fun getUpComingFromDB():List<UpComing>
    suspend fun saveUpComingToDB(upComing:List<UpComing>)
    suspend fun clearAll()
}