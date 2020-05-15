package com.example.tp7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



       val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "app.db"
        ).allowMainThreadQueries().build()

        db.getActorDo().insert(Actor(1,"aaa","bbbb"))
        db.getActorDo().insert(Actor(2,"aaa1","ccc"))
        db.getActorDo().insert(Actor(3,"aaa2","dd"))
        val listActos = db.getActorDo().getActors()
        println(listActos.size)
        println("hellooooooooooooooooooooooooo")

        btn_movie.setOnClickListener {
            val intent = Intent( this, ListActivity::class.java)
            intent.putExtra("from", "movie")
            this.startActivity(intent)
        }
        btn_actor.setOnClickListener {
            val intent = Intent( this, ListActivity::class.java)
            intent.putExtra("from", "actor")
            this.startActivity(intent)
        }

    }





}
