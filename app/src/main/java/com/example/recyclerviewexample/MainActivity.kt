package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val list = listOf(
            EmployeeModel("Mohamed","Mobile Developer" , R.drawable.avatar),
            EmployeeModel("Belal","Mobile Developer" , R.drawable.avatar),
            EmployeeModel("Ali","Mobile Developer" , R.drawable.avatar)
        )


        val recyclerAdapter = RecyclerAdapter(list)

        recyclerView.adapter = recyclerAdapter
    }
}