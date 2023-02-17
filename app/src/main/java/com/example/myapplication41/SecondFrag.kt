package com.example.myapplication41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFrag : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MusicAdapter
    private lateinit var songType: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second_frag, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        //------------------------------------------------------

        recyclerView = view.findViewById(R.id.recycleView_fragSec)
        recyclerView.layoutManager = layoutManager

        //------------------------------------------------------

        val songList = listOf(
            Songs(R.drawable.baseline_music_note_24, "CENERE", "Lazza"),
            Songs(R.drawable.baseline_music_note_24,"Shiva","Anche se non lo sai"),
            Songs(R.drawable.baseline_music_note_24,"SALMO","PERDONAMI"),
            Songs(R.drawable.baseline_music_note_24,"Blanco","Notti in Bianco"),
            Songs(R.drawable.baseline_music_note_24,"Central cee","Let is go"),
            Songs(R.drawable.baseline_music_note_24,"Massimo Ranieri","Bella stronza"))

        //------------------------------------------------------

        adapter = MusicAdapter(songList )


        recyclerView.adapter = adapter

    }

    private fun <T> listOf(element: Int) {

    }
}

