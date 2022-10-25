package com.example.retrofit.domain.usecase

import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.domain.repository.TvShowRepository

class GetTvShowsUseCase (private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.getTvShows()
}