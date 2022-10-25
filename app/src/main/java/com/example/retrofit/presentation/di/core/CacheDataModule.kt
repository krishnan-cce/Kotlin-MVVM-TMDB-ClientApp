package com.example.retrofit.presentation.di.core


import com.example.retrofit.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.retrofit.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.example.retrofit.data.repository.movie.datasource.MovieCacheDataSource
import com.example.retrofit.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.retrofit.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.retrofit.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import com.example.retrofit.data.repository.upcoming.datasource.UpComingCacheDataSource
import com.example.retrofit.data.repository.upcoming.datasourceImpl.UpComingCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideUpComingCacheDataSource(): UpComingCacheDataSource {
        return UpComingCacheDataSourceImpl()
    }
}