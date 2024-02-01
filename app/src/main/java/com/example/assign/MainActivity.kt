package com.example.assign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var apiViewModel: ApiViewModel
    private lateinit var apiAdapter: ApiAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var TodayClicks=findViewById<TextView>(R.id.today_clicks)
        var TopLocation=findViewById<TextView>(R.id.top_location)
        var TopSource=findViewById<TextView>(R.id.top_source)



        apiViewModel = ViewModelProvider(this).get(ApiViewModel::class.java)
        apiAdapter = ApiAdapter(mutableListOf())
        var recyclerView=findViewById<RecyclerView>(R.id.rcy2)
        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = apiAdapter

        // Observe changes in the LiveData and update the adapter
        apiViewModel.apiDataList.observe(this, { apiDataList ->
            apiAdapter.update(apiDataList)
       TodayClicks.text=apiDataList[0].today_clicks.toString()
       TopLocation.text=apiDataList[0].top_location.toString()
       TopSource.text=apiDataList[0].top_source.toString()

        })

        // Fetch data from the API
        apiViewModel.fetchData(this, apiAdapter)


    }
}