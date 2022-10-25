package com.example.retrofit.presentation.di.upcoming

import com.example.retrofit.domain.usecase.GetArtistsUseCase
import com.example.retrofit.domain.usecase.GetUpComingUseCase
import com.example.retrofit.domain.usecase.UpdateArtistsUseCase
import com.example.retrofit.domain.usecase.UpdateUpComingUseCase
import com.example.retrofit.presentation.artist.ArtistViewModelFactory
import com.example.retrofit.presentation.di.artist.ArtistScope
import com.example.retrofit.presentation.upcoming.UpComingViewModelFactory
import dagger.Module
import dagger.Provides



@Module
class UpComingModule {
    @ArtistScope
    @Provides
    fun provideUpComingViewModelFactory(
        getUpComingUseCase: GetUpComingUseCase,
        updateUpComingUseCase: UpdateUpComingUseCase
    ): UpComingViewModelFactory {
        return UpComingViewModelFactory(
            getUpComingUseCase,
            updateUpComingUseCase
        )
    }

}