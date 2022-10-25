package com.example.retrofit.presentation.di.upcoming

import com.example.retrofit.presentation.artist.ArtistActivity
import com.example.retrofit.presentation.di.artist.ArtistModule
import com.example.retrofit.presentation.di.artist.ArtistScope
import com.example.retrofit.presentation.upcoming.UpcomingActivity
import dagger.Subcomponent


@ArtistScope
@Subcomponent(modules = [UpComingModule::class])
interface UpComingSubComponent {
    fun inject(upcomingActivity: UpcomingActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():UpComingSubComponent
    }

}