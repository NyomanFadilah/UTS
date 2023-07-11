package com.nyoman.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BuildAdapter(private val contex: Context, private val build: List<Build>, val listener: (Build) -> Unit)
    : RecyclerView.Adapter<BuildAdapter.BuildViewHolder>(){

    class BuildViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgBuild = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameBuild  = view.findViewById<TextView>(R.id.tv_item_name)
        val DescriptionBuild = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(build: Build, listener: (Build) -> Unit){
            imgBuild .setImageResource(build.imgBuild)
            nameBuild .text = build.nameBuild
            DescriptionBuild.text =build.DescriptionBuild
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuildViewHolder {
        return BuildViewHolder(
            LayoutInflater.from(contex).inflate(R.layout.item_build, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BuildViewHolder, position: Int) {
        holder.bindView(build[position], listener)
    }

    override fun getItemCount(): Int = build.size
}
