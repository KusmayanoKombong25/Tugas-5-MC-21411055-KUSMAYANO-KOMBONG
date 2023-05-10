package com.mkrdeveloper.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var imageId: Array<Int>
    private lateinit var names: Array<String>
    private lateinit var ingredients: Array<String>

    private lateinit var recView: RecyclerView
    private lateinit var itemArrayList: ArrayList<bunga>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.gmbr,
            R.drawable.gmbr1,
            R.drawable.gmbr3,
            R.drawable.kaktus,

        )

        names = arrayOf(
            "Bunga Matahari",
            "Bunga Bangkai",
            "Bunga Pemakan Serangga",
            "Kaktus",

        )

        ingredients = arrayOf(
            "ini adalah bunga matahari",
            "ini adalah bunga bangkai",
            "ini adalah bunga pemakan serangga",
            "ini adalah kaktus",

        )


        recView = findViewById(R.id.recView)
        // the type of the recyclerView. linear or grid
        recView.layoutManager = GridLayoutManager(this,3)

        recView.setHasFixedSize(true)


        itemArrayList = arrayListOf()

        getData()

        recView.adapter = RecAadapter(itemArrayList)


    }

    private fun getData() {

        for (i in imageId.indices) {
            val pizza = bunga(imageId[i], names[i], ingredients[i])
            itemArrayList.add(pizza)
        }
    }
}