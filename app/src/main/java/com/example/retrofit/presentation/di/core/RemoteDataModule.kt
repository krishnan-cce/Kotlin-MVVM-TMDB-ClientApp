package com.example.retrofit.presentation.di.core


import com.example.retrofit.data.api.TMDBService
import com.example.retrofit.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.retrofit.data.repository.artist.datasourceImpl.ArtistRemoteDataSourceImpl
import com.example.retrofit.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.retrofit.data.repository.movie.datasourceImpl.MovieRemoteDataSourceImpl
import com.example.retrofit.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.retrofit.data.repository.tvshow.datasourceImpl.TvShowRemoteDataSourceImpl
import com.example.retrofit.data.repository.upcoming.datasource.UpComingRemoteDataSource
import com.example.retrofit.data.repository.upcoming.datasourceImpl.UpComingRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideTvRemoteDataSource(tmdbService: TMDBService): TvShowRemoteDatasource {
        return TvShowRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

    @Singleton
    @Provides
    fun provideArtistRemoteDataSource(tmdbService: TMDBService): ArtistRemoteDatasource {
        return ArtistRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }
    @Singleton
    @Provides
    fun provideUpComingRemoteDataSource(tmdbService: TMDBService): UpComingRemoteDataSource {
        return UpComingRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }

}