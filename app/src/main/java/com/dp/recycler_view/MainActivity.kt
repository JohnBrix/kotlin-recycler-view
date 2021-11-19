package com.dp.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dp.recycler_view.adapter.Adapter

class MainActivity : AppCompatActivity() {

    private val img = arrayOf(R.drawable.image1,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8)

    private val texts = arrayOf(
        "Ibanez RG789 Violet",
        "Ibanez Jem JR Steve vai",
        "Ibanez RGD Dark rose",
        "Ibanez RGA17 FR Blue gray",
        "Ibanez FM126 FR",
        "Ibanez DR128 FX",
        "Ibanez Iron label")

    private val desc = arrayOf(
        "RG Series",
        "JEM Series",
        "RGD Series",
        "RGA Series",
        "FM Series",
        "DR Series",
        "Iron label Series")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(img, texts, desc)
    }
}