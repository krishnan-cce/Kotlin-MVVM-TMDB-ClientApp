package com.example.retrofit.data.repository.artist.datasource

import com.example.retrofit.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}