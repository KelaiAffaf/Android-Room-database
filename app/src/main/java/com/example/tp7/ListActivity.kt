package com.example.tp7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ListActivity)
            adapter = AppAdapter(this@ListActivity,loadData())
        }

        add_btn.setOnClickListener {
            val intent = Intent( this, movie_Form::class.java)
            this.startActivity(intent)
        }

    }

    fun loadData():List<Movie> {
        val data = mutableListOf<Movie>()
        data.add(Movie(1, "Movie 1","2001"))
        data.add(Movie(2,"Movie 2","2002"))
        data.add(Movie(3, "Movie 3","2003"))
        data.add(Movie(4, "Movie 4","2004"))

        return data
    }
}
