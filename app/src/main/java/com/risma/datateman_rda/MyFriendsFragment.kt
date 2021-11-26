package com.risma.datateman_rda

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend( "Risma Dewi Aprilliya", "Perempuan", "risma_20520010@stimata.ac.id",
                "085257300316",  "Sumbersuko")
        )
        listTeman.add(MyFriend( "Erni Septiani","Perempuan", "erni_20510006@stimata.ac.id",
                "085784011532",  "Kepung")
        )
        listTeman.add(MyFriend( "Abdullah Arwani M","Laki-laki","abdullah_20520001@stimata.ac.id",
                "085815151264",  "Malang")
        )
        listTeman.add(MyFriend( "Muhammad Mudzakir", "Laki-laki", "muhammad_20520008@stimata.ac.id",
                "085815450549",  "Tulung Agung")
        )
        listTeman.add(MyFriend( "Rendy Wijaya", "Laki-laki","rendy_18310001@stimata.ac.id",
                "082235836205",  "Jombang")
        )
        listTeman.add(MyFriend( "Veti Ningrum", "Perempuan", "veti_20510010@stimata.ac.id",
                 "083830265245",  "Malang")
        )
        listTeman.add(MyFriend( "Duwi Setiawan", "Laki-laki","duwi_18510011@stimata.ac.id",
                "083845557815",  "Jombok")
        )
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(),listTeman)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}