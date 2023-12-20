package com.example.syncverse

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val images:List<Int>):
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {
   inner class ViewPagerViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val itemView1:ImageView=itemView.findViewById(R.id.ivImage)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.ViewPagerViewHolder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewPagerViewHolder(view)
    }



    override fun onBindViewHolder(holder: ViewPagerAdapter.ViewPagerViewHolder, position: Int) {
      val currImage=images[position]
        holder.itemView1.setImageResource(currImage)
    }

    override fun getItemCount(): Int {
       return images.size
    }
}