package com.example.retrofit.data.repository.movie.datasourceImpl

import com.example.retrofit.data.api.TMDBService
import com.example.retrofit.data.model.movie.MovieList
import com.example.retrofit.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}