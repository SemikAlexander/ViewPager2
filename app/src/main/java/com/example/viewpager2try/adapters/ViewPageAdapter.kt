package com.example.viewpager2try.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2try.R

class ViewPageAdapter(context: Context) : RecyclerView.Adapter<ViewPageAdapter.PagerVH>() {
    //array of colors to change the background color of screen
    private val matrix_array = arrayOf(
        intArrayOf(android.R.color.black, R.drawable.ic_baseline_account_box_24),
        intArrayOf(android.R.color.holo_red_light, R.drawable.ic_baseline_monetization_on_24),
        intArrayOf(android.R.color.holo_blue_dark, R.drawable.ic_baseline_directions_car_24),
        intArrayOf(android.R.color.holo_purple, R.drawable.ic_baseline_location_on_24)
    )

    class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView){
        var img_view: ImageView = itemView.findViewById(R.id.ivImage) as ImageView
        var container: RelativeLayout = itemView.findViewById(R.id.container) as RelativeLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH {
        return PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun getItemCount(): Int = matrix_array.size

    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run  {
        holder.img_view.setImageResource(matrix_array[position][1])
        holder.container.setBackgroundResource(matrix_array[position][0])
    }
}
