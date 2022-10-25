package com.example.retrofit.domain.usecase

import com.example.retrofit.data.model.movie.Movie
import com.example.retrofit.domain.repository.MovieRepository

class UpdateMoviesUseCase (private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.updateMovies()
}