package com.example.retrofit.presentation.di.core




import com.example.retrofit.presentation.di.artist.ArtistSubComponent
import com.example.retrofit.presentation.di.movie.MovieSubComponent
import com.example.retrofit.presentation.di.tvshow.TvShowSubComponent
import com.example.retrofit.presentation.di.upcoming.UpComingSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent(): MovieSubComponent.Factory
fun tvShowSubComponent(): TvShowSubComponent.Factory
fun artistSubComponent(): ArtistSubComponent.Factory
fun upcomingSubComponent(): UpComingSubComponent.Factory
}