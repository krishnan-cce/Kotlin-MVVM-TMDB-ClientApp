package com.example.retrofit.data.repository.upcoming.datasourceImpl

import com.example.retrofit.data.model.movie.Movie
import com.example.retrofit.data.model.upcomming.UpComing
import com.example.retrofit.data.repository.movie.datasource.MovieCacheDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingCacheDataSource


class UpComingCacheDataSourceImpl :
    UpComingCacheDataSource {
    private var upComingList = ArrayList<UpComing>()

    override suspend fun getUpComingFromCache(): List<UpComing> {
        return upComingList
    }

    override suspend fun saveUpComingToCache(upComing: List<UpComing>) {
        upComingList.clear()
        upComingList = ArrayList(upComing)
    }
}