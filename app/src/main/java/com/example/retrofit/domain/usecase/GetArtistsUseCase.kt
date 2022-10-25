package com.example.retrofit.domain.usecase

import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.domain.repository.ArtistsRepository


class GetArtistsUseCase(private val artistRepository: ArtistsRepository) {
    suspend fun execute():List<Artist>? = artistRepository.getArtists()
}