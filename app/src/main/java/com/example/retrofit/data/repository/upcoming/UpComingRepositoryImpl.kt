package com.example.retrofit.data.repository.upcoming


import android.util.Log
import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing
import com.example.retrofit.data.repository.upcoming.datasource.UpComingCacheDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingLocalDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingRemoteDataSource
import com.example.retrofit.domain.repository.TvShowRepository
import com.example.retrofit.domain.repository.UpComingRepository
import java.lang.Exception

class UpComingRepositoryImpl(
    private val upComingRemoteDataSource: UpComingRemoteDataSource,
    private val upComingLocalDataSource: UpComingLocalDataSource,
    private val upComingCacheDataSource: UpComingCacheDataSource
): UpComingRepository {
    override suspend fun getUpComing(): List<UpComing>? {
        return getTvShowsFromCache()
    }

    override suspend fun updateUpComing(): List<UpComing>? {
        val newListOfUpComing = getUpComingFromAPI()
        upComingLocalDataSource.clearAll()
        upComingLocalDataSource.saveUpComingToDB(newListOfUpComing)
        upComingCacheDataSource.saveUpComingToCache(newListOfUpComing)
        return newListOfUpComing
    }

    suspend fun getUpComingFromAPI(): List<UpComing> {
        lateinit var upComingList: List<UpComing>
        try {
            val response = upComingRemoteDataSource.getUpcoming()
            val body = response.body()
            if(body!=null){
                upComingList = body.results
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return upComingList
    }
    suspend fun getUpComingFromDB():List<UpComing>{
        lateinit var upComingList: List<UpComing>
        try {
            upComingList = upComingLocalDataSource.getUpComingFromDB()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(upComingList.size>0){
            return upComingList
        }else{
            upComingList=getUpComingFromAPI()
            upComingLocalDataSource.saveUpComingToDB(upComingList)
        }

        return upComingList
    }
    suspend fun getTvShowsFromCache():List<UpComing>{
        lateinit var upComingList: List<UpComing>
        try {
            upComingList =upComingCacheDataSource.getUpComingFromCache()
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        if(upComingList.size>0){
            return upComingList
        }else{
            upComingList=getUpComingFromDB()
            upComingCacheDataSource.saveUpComingToCache(upComingList)
        }

        return upComingList
    }
}