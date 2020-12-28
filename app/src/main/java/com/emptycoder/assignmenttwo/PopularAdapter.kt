package com.emptycoder.assignmenttwo

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PopularAdapter(private val plist: ArrayList<Item>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    class PopularViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.pimg)
        val name = itemView.findViewById<TextView>(R.id.name)
        val brand = itemView.findViewById<TextView>(R.id.brand)
        val price = itemView.findViewById<TextView>(R.id.price)

        fun bind(item: Item){
            img.setImageResource(item.image)
            name.setText(item.name)
            brand.setText(item.brand)
            price.setText(item.price.toString())
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        return PopularViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.popular_item_view,parent,false))
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bind(plist[position])
    }

    override fun getItemCount(): Int {
        return plist.size
    }
}