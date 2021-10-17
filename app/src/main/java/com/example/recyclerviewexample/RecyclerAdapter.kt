package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list: List<EmployeeModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {



    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val fullName: TextView = view.findViewById(R.id.full_name_text)
        val jobTitle: TextView = view.findViewById(R.id.job_title_text)
        val img: ImageView = view.findViewById(R.id.emp_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.fullName.text = list.get(position).full_name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}