package com.emptycoder.assignmenttwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: ArrayList<Item>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img = itemView.findViewById<ImageView>(R.id.itemImg)
        val name = itemView.findViewById<TextView>(R.id.itemName)
        val code = itemView.findViewById<TextView>(R.id.itemcode)
        val brand = itemView.findViewById<TextView>(R.id.itembrand)
        val price = itemView.findViewById<TextView>(R.id.itemPrice)

        fun bind(item: Item){
            img.setImageResource(item.image)
            name.setText(item.name)
            code.setText(item.otherName)
            brand.setText(item.brand)
            price.setText(item.price.toString())
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder{
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}