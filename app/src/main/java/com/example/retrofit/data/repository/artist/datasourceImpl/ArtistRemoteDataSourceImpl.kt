package com.example.retrofit.data.repository.artist.datasourceImpl

import com.example.retrofit.data.api.TMDBService
import com.example.retrofit.data.model.artist.ArtistList
import com.example.retrofit.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}