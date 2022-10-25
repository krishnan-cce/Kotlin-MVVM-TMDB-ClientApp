package com.example.retrofit.presentation.upcoming

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.retrofit.R
import com.example.retrofit.data.model.artist.Artist
import com.example.retrofit.data.model.upcomming.UpComing
import com.example.retrofit.databinding.ListItemBinding


class UpComingAdapter: RecyclerView.Adapter<UpComingAdapter.MyViewHolder>() {
    private val upComingList = ArrayList<UpComing>()

    fun setList(upComing:List<UpComing>){
        upComingList.clear()
        upComingList.addAll(upComing)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(upComingList[position])
    }

    override fun getItemCount(): Int {
        return upComingList.size
    }

    class MyViewHolder(val binding: ListItemBinding):
        RecyclerView.ViewHolder(binding.root){

        fun bind(upcoming:UpComing){
            binding.titleTextView.text = upcoming.originalTitle
            binding.descriptionTextView.text = upcoming.originalLanguage
            val posterURL = "https://image.tmdb.org/t/p/w500"+upcoming.posterPath
            Glide.with(binding.imageView.context)
                .load(posterURL)
                .into(binding.imageView)

        }
    }
}