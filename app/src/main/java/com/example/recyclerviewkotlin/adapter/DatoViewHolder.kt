package com.example.recyclerviewkotlin.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewkotlin.Dato
import com.example.recyclerviewkotlin.R

class DatoViewHolder(view:View):RecyclerView.ViewHolder(view){

    val name = view.findViewById<TextView>(R.id.tvName)
    val par1 = view.findViewById<TextView>(R.id.tvParam1)
    val par2 = view.findViewById<TextView>(R.id.tvParam2)
    val img = view.findViewById<ImageView>(R.id.iv1)

    fun render(datoModel: Dato){
        name.text = datoModel.nombre
        par1.text = datoModel.param1
        par2.text = datoModel.param2
        Glide.with(img.context).load(datoModel.photo).into(img)
    }
}