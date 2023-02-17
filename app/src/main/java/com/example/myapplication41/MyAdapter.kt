package com.example.myapplication41

import  android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class MusicAdapter(val songList: List<Songs>) : RecyclerView.Adapter<MusicAdapter.MyViewHolder>() {

    class MyViewHolder (view : View) : RecyclerView.ViewHolder(view) {

        val songName : TextView
        val songName_2 : TextView
        val image : ShapeableImageView

        //fun bindView(image : Songs){}

        init{
            songName = view.findViewById(R.id.songHeading)
            songName_2 = view.findViewById(R.id.songHeading2)
            image = view.findViewById(R.id.title_image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val songView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(songView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.songName.text = songList[position].artist
        holder.songName_2.text = songList[position].title
        holder.image.setImageResource(R.drawable.baseline_music_note_24)



    }

    override fun getItemCount(): Int {
        return songList.size

    }

}