package com.example.retrofit.presentation.upcoming

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.retrofit.domain.usecase.GetArtistsUseCase
import com.example.retrofit.domain.usecase.GetUpComingUseCase
import com.example.retrofit.domain.usecase.UpdateArtistsUseCase
import com.example.retrofit.domain.usecase.UpdateUpComingUseCase

class UpComingViewModel(
    private val getUpComingUseCase: GetUpComingUseCase,
    private val updateUpComingUseCase: UpdateUpComingUseCase
): ViewModel() {

    fun getUpComing() = liveData {
        Log.i("ARTTAG","artist view model getUpcoming")
        val upComingList = getUpComingUseCase.execute()
        emit(upComingList)
    }

    fun updateUpComing() = liveData {
        val upComingList = updateUpComingUseCase.execute()
        emit(upComingList)
    }

}