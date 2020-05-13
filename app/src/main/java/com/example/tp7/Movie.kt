package com.example.tp7

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.ArrayList



    @Entity(tableName = "Movie_table")

   data class Movie(

        @PrimaryKey(autoGenerate = true) var id: Long,
        @ColumnInfo(name = "title") var title: String,
        @ColumnInfo(name = "year") var year: String

    )


