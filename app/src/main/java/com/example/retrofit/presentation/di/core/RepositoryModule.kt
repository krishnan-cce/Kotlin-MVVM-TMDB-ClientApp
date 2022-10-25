package com.example.retrofit.presentation.di.core

import com.example.retrofit.domain.repository.ArtistsRepository
import com.example.retrofit.data.repository.artist.ArtistRepositoryImpl
import com.example.retrofit.data.repository.artist.datasource.ArtistCacheDataSource
import com.example.retrofit.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.retrofit.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.retrofit.data.repository.movie.MovieRepositoryImpl
import com.example.retrofit.data.repository.movie.datasource.MovieCacheDataSource
import com.example.retrofit.data.repository.movie.datasource.MovieLocalDataSource
import com.example.retrofit.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.retrofit.data.repository.tvshow.TvShowRepositoryImpl
import com.example.retrofit.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.example.retrofit.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.retrofit.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.retrofit.data.repository.upcoming.UpComingRepositoryImpl
import com.example.retrofit.data.repository.upcoming.datasource.UpComingCacheDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingLocalDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingRemoteDataSource
import com.example.retrofit.domain.repository.MovieRepository
import com.example.retrofit.domain.repository.TvShowRepository
import com.example.retrofit.domain.repository.UpComingRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {

        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )


    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistsRepository {

        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )


    }
    @Provides
    @Singleton
    fun provideUpcomingRepository(
        upComingRemoteDataSource: UpComingRemoteDataSource,
        upComingLocalDataSource: UpComingLocalDataSource,
        upComingCacheDataSource: UpComingCacheDataSource
    ): UpComingRepository {

        return UpComingRepositoryImpl(
            upComingRemoteDataSource,
            upComingLocalDataSource,
            upComingCacheDataSource
        )


    }
}