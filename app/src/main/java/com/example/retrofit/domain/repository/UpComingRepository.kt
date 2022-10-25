package com.example.retrofit.domain.repository

import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing


interface UpComingRepository {

    suspend fun getUpComing():List<UpComing>?
    suspend fun updateUpComing():List<UpComing>?

}