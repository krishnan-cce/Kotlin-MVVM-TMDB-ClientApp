package com.example.retrofit.presentation.di.movie


import com.example.retrofit.presentation.di.movie.MovieModule
import com.example.retrofit.presentation.di.movie.MovieScope
import com.example.retrofit.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }

}

