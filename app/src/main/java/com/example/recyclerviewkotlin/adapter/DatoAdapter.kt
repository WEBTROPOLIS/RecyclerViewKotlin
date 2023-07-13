package com.example.recyclerviewkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.Dato
import com.example.recyclerviewkotlin.R

class DatoAdapter(private val dato:List<Dato>) : RecyclerView.Adapter<DatoViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DatoViewHolder(layoutInflater.inflate(R.layout.item_dato,parent,false))
    }

    override fun getItemCount(): Int {
        return dato.size
    }

    override fun onBindViewHolder(holder: DatoViewHolder, position: Int) {
        val item = dato[position]
        holder.render(item)
    }

}