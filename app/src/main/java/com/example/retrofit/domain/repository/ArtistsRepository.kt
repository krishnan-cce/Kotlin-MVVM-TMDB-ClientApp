package com.example.retrofit.domain.repository

import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.data.model.movie.Movie

interface ArtistsRepository {

    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}