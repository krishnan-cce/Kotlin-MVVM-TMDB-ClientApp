package com.example.retrofit.presentation.di.movie


import com.example.retrofit.domain.usecase.GetMoviesUseCase
import com.example.retrofit.domain.usecase.UpdateMoviesUseCase
import com.example.retrofit.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }

}