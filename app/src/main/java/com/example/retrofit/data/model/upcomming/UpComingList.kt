package com.example.retrofit.data.model.upcomming


import com.google.gson.annotations.SerializedName

data class UpComingList(


    @SerializedName("results")
    val results: List<UpComing>

)