package com.example.retrofit.data.repository.upcoming.datasourceImpl

import com.example.retrofit.data.api.TMDBService
import com.example.retrofit.data.model.tvshow.TvShowList
import com.example.retrofit.data.model.upcomming.UpComingList
import com.example.retrofit.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingRemoteDataSource
import retrofit2.Response


class UpComingRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): UpComingRemoteDataSource {
    override suspend fun getUpcoming()
            : Response<UpComingList> = tmdbService.getUpcomingMovies(apiKey)

}
