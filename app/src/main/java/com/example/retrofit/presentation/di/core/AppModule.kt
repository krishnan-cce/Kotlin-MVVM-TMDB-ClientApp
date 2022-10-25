package com.example.retrofit.presentation.di.core

import android.content.Context
import com.example.retrofit.presentation.di.artist.ArtistSubComponent
import com.example.retrofit.presentation.di.movie.MovieSubComponent
import com.example.retrofit.presentation.di.tvshow.TvShowSubComponent
import com.example.retrofit.presentation.di.upcoming.UpComingSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class,TvShowSubComponent::class, ArtistSubComponent::class,UpComingSubComponent::class])
class AppModule(private val context: Context) {

 @Singleton
 @Provides
 fun provideApplicationContext():Context{
     return context.applicationContext
 }





}