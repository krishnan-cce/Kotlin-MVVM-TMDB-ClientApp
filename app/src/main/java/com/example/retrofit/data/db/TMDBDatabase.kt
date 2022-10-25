package com.example.retrofit.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.data.model.movie.Movie
import com.example.retrofit.data.model.tvshow.TvShow
import com.example.retrofit.data.model.upcomming.UpComing

@Database(entities = [Movie::class, TvShow::class, Artist::class,UpComing::class],
    version = 2,
    exportSchema = false
)
abstract class TMDBDatabase: RoomDatabase() {

    abstract fun movieDao(): MovieDao
    abstract fun tvDao(): TvShowDao
    abstract fun artistDao(): ArtistDao
    abstract fun upcomingDo(): UpComingDao
}