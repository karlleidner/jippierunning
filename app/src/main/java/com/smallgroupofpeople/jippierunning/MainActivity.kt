package com.smallgroupofpeople.jippierunning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with activities
    val runs: ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Loads animals into the ArrayList
        addAnimals()

        // Creates a vertical Layout Manager
        rv_activity_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
//        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        rv_activity_list.adapter = ActivityAdapter(runs, this)

    }

    // Adds animals to the empty animals ArrayList
    fun addAnimals() {
        runs.add("Höga kusten")
        runs.add("HCUT")
        runs.add("Gulsparven")
        runs.add("Obbola backyard")
        runs.add("Umåker trail")
        runs.add("Härnö trail")
        runs.add("parrot")
    }
}
