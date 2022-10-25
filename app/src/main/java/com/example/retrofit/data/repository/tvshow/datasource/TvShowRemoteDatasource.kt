package com.example.retrofit.data.repository.tvshow.datasource


import com.example.retrofit.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
   suspend fun getTvShows(): Response<TvShowList>
}