package com.example.tp7

import androidx.room.Entity
import androidx.room.ForeignKey


@Entity(primaryKeys = ["movieId", "acteurId"],
    foreignKeys = [
        ForeignKey(entity = Movie::class,
            parentColumns = ["id"],
            childColumns = ["movieId"]),
        ForeignKey(entity = Actor::class,
            parentColumns = ["id"],
            childColumns = ["acteurId"])
    ])

data class ActeurMovie (
    val movieId: Long,
    val acteurId: Long


)