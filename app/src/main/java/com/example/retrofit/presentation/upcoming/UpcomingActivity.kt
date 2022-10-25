package com.example.retrofit.presentation.upcoming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofit.R
import com.example.retrofit.databinding.ActivityArtistBinding
import com.example.retrofit.databinding.ActivityUpcomingBinding
import com.example.retrofit.presentation.artist.ArtistAdapter
import com.example.retrofit.presentation.artist.ArtistViewModel
import com.example.retrofit.presentation.artist.ArtistViewModelFactory
import com.example.retrofit.presentation.di.Injector
import com.example.retrofit.presentation.movie.MovieAdapter
import com.example.retrofit.presentation.movie.MovieViewModel
import javax.inject.Inject

class UpcomingActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: UpComingViewModelFactory
    private lateinit var upcomingViewModel: UpComingViewModel
    private lateinit var adapter: UpComingAdapter
    private lateinit var binding: ActivityUpcomingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_upcoming)
        (application as Injector).createUpComingSubComponent()
            .inject(this)
        upcomingViewModel = ViewModelProvider(this, factory)
            .get(UpComingViewModel::class.java)
        val responseLiveData = upcomingViewModel.getUpComing()
        responseLiveData.observe(this, Observer {
            Log.i("MYTAG", it.toString())
        })
        initRecyclerView()

    }


    private fun initRecyclerView() {
        binding.upcomingRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = UpComingAdapter()
        binding.upcomingRecyclerView.adapter = adapter
        displayPopularUpcoming()
    }
    private fun displayPopularUpcoming(){
        Log.i("ARTTAG","artist activity display popular atrtist")
        binding.upcomingProgressBar.visibility = View.VISIBLE
        val responseLiveData = upcomingViewModel.getUpComing()
        responseLiveData.observe(this, Observer {
            if(it!=null){
                Log.i("ARTTAG","observed ${it.toString()}")
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.upcomingProgressBar.visibility = View.GONE
            }else{
                binding.upcomingProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext,"No data available", Toast.LENGTH_LONG).show()
            }
        })
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_update -> {
                updateUpComing()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    private fun updateUpComing(){
        binding.upcomingProgressBar.visibility = View.VISIBLE
        val response = upcomingViewModel.updateUpComing()
        response.observe(this, Observer {
            if(it!=null){
                adapter.setList(it)
                adapter.notifyDataSetChanged()
                binding.upcomingProgressBar.visibility = View.GONE
            }else{
                binding.upcomingProgressBar.visibility = View.GONE
            }
        })
    }

}