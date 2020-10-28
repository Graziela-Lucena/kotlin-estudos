package com.example.projeto_github

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter(private val exampleList : List<ExampleItem> ) : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
      val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
      parent, false)
       return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResourse)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2
        holder.textView.text = currentItem.text
        holder.textViewNome.text = currentItem.textNome
        holder.numBranches.text = currentItem.numBranches
        holder.numStars.text = currentItem.numStars
        holder.imageBranches.setImageResource(currentItem.imageBranches)
        holder.imageStars.setImageResource(currentItem.imageStars)


    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){

        val imageView : ImageView = itemView.image_view
        val textView1 : TextView = itemView.text_view1
        val textView2 : TextView = itemView.text_view2
        val textView : TextView = itemView.text_view
        val textViewNome : TextView = itemView.text_view_nome
        val numBranches : TextView = itemView.text_branches
        val numStars : TextView = itemView.text_stars
        val imageBranches : ImageView = itemView.image_branch
        val imageStars : ImageView = itemView.image_stars
    }

}