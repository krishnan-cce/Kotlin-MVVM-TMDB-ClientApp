package com.example.retrofit.data.repository.upcoming.datasource

import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing


interface UpComingCacheDataSource {
    suspend fun getUpComingFromCache():List<UpComing>
    suspend fun saveUpComingToCache(upComing:List<UpComing>)

}