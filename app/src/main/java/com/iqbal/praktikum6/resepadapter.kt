package com.iqbal.praktikum6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_list_item.view.*


class resepadapter (val resepItemList: List<dataresep>, val clickListener: (dataresep) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder , position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    override fun getItemCount() = resepItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(resep: dataresep, clickListener: (dataresep) -> Unit) {
            itemView.tv_nama.text = resep.namaMakanan.toString()
            itemView.tv_foto.setImageResource(resep.foto)

            itemView.setOnClickListener{ clickListener(resep)}
        }
    }
}