package com.example.retrofit.presentation.upcoming

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.domain.usecase.GetArtistsUseCase
import com.example.retrofit.domain.usecase.GetUpComingUseCase
import com.example.retrofit.domain.usecase.UpdateArtistsUseCase
import com.example.retrofit.domain.usecase.UpdateUpComingUseCase
import com.example.retrofit.presentation.artist.ArtistViewModel


class UpComingViewModelFactory(
    private val getUpComingUseCase: GetUpComingUseCase,
    private val updateUpComingUseCase: UpdateUpComingUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return UpComingViewModel(
            getUpComingUseCase,
            updateUpComingUseCase
        ) as T
    }
}