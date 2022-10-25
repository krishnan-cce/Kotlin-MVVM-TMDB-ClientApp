package com.example.retrofit.data.repository.upcoming.datasourceImpl

import com.example.retrofit.data.db.TvShowDao
import com.example.retrofit.data.db.UpComingDao
import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing
import com.example.retrofit.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.retrofit.data.repository.upcoming.datasource.UpComingLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class UpComingLocalDataSourceImpl(private val upcomingDao: UpComingDao):
    UpComingLocalDataSource {
    override suspend fun getUpComingFromDB(): List<UpComing> {
        return upcomingDao.getUpcoming()
    }

    override suspend fun saveUpComingToDB(upComing: List<UpComing>) {
        CoroutineScope(Dispatchers.IO).launch {
            upcomingDao.saveUpcoming(upComing)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            upcomingDao.deleteAllUpcoming()
        }
    }
}