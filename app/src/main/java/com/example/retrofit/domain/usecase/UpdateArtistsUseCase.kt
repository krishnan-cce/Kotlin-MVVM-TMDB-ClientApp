package com.example.retrofit.domain.usecase

import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.data.model.movie.Movie
import com.example.retrofit.domain.repository.ArtistsRepository
import com.example.retrofit.domain.repository.MovieRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistsRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}