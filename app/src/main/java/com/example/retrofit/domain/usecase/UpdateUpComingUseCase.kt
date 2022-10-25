package com.example.retrofit.domain.usecase

import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing
import com.example.retrofit.domain.repository.TvShowRepository
import com.example.retrofit.domain.repository.UpComingRepository


class UpdateUpComingUseCase (private val upComingRepository: UpComingRepository) {
    suspend fun execute():List<UpComing>? = upComingRepository.updateUpComing()
}