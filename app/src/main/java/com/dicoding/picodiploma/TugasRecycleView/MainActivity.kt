package com.dicoding.picodiploma.TugasRecycleView

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvAndroid: RecyclerView
    private var list: ArrayList<Android> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAndroid = findViewById(R.id.rv_android)
        rvAndroid.setHasFixedSize(true)

        list.addAll(AndroidData.listData)
        showRecyclerList()
    }

    private fun showSelectedAndroid(android: Android) {
        Toast.makeText(this, "Kamu memilih " + android.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerList() {
        rvAndroid.layoutManager = LinearLayoutManager(this)
        val listAndroidAdapter = ListAndroidAdapter(list)
        rvAndroid.adapter = listAndroidAdapter

        listAndroidAdapter.setOnItemClickCallback(object : ListAndroidAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Android) {
                showSelectedAndroid(data)
            }
        })
    }

}