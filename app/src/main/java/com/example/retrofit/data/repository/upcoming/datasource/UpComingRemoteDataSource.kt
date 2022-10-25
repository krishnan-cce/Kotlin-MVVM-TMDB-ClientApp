package com.example.retrofit.data.repository.upcoming.datasource

import com.example.retrofit.data.model.tvshow.TvShowList
import com.example.retrofit.data.model.upcomming.UpComingList
import retrofit2.Response


interface UpComingRemoteDataSource {
    suspend fun getUpcoming(): Response<UpComingList>
}