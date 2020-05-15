package com.example.tp7

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.ArrayList



@Entity(tableName = "Acteur_table")

data class Actor(

    @PrimaryKey(autoGenerate = true) val id: Long,
    @ColumnInfo(name = "Firstname") val Firstname: String,
    @ColumnInfo(name = "lastName") val lastName: String

)