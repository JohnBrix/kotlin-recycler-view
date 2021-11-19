package com.dp.recycler_view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dp.recycler_view.R

class Adapter(
    val img: Array<Int>,
    val texts: Array<String>,
    val desc: Array<String>
) : RecyclerView.Adapter<Adapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindValue(image: Int, txt: String, desc: String) {
            itemView.findViewById<ImageView>(R.id.imageView).setImageResource(image)
            itemView.findViewById<TextView>(R.id.text1).text = txt
            itemView.findViewById<TextView>(R.id.text2).text = desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindValue(img[position], texts[position], desc[position])
    }

    override fun getItemCount(): Int {
        return img.size
    }
}