package com.example.retrofit.data.repository.tvshow.datasourceImpl


import com.example.retrofit.data.api.TMDBService
import com.example.retrofit.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.retrofit.data.model.tvshow.TvShowList
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

