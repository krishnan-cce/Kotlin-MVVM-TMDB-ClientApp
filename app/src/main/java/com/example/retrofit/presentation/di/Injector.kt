package com.example.retrofit.presentation.di

import com.example.retrofit.presentation.di.artist.ArtistSubComponent
import com.example.retrofit.presentation.di.movie.MovieSubComponent
import com.example.retrofit.presentation.di.tvshow.TvShowSubComponent
import com.example.retrofit.presentation.di.upcoming.UpComingSubComponent


interface Injector {
   fun createMovieSubComponent(): MovieSubComponent
   fun createTvShowSubComponent(): TvShowSubComponent
   fun createArtistSubComponent(): ArtistSubComponent
   fun createUpComingSubComponent(): UpComingSubComponent
}