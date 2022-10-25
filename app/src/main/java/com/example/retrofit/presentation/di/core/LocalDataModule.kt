package com.example.retrofit.presentation.di.core


import com.example.retrofit.data.db.ArtistDao

import com.example.retrofit.data.db.MovieDao
import com.example.retrofit.data.db.TvShowDao
import com.example.retrofit.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.retrofit.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.retrofit.data.repository.movie.datasource.MovieLocalDataSource
import com.example.retrofit.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.retrofit.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.retrofit.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao : ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}