package com.example.retrofit.data.repository.movie.datasource

import com.example.retrofit.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}