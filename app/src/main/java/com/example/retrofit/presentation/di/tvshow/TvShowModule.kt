package com.example.retrofit.presentation.di.tvshow



import com.example.retrofit.domain.usecase.GetTvShowsUseCase
import com.example.retrofit.domain.usecase.UpdateTvShowsUseCase
import com.example.retrofit.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}