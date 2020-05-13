package com.example.tp7


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ActorDao {

    @Query("SELECT * from Acteur_table ORDER BY Acteur_table.lastName ASC")
    fun getActors(): List<Actor>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insert(actor:Actor)

    @Query("DELETE FROM Acteur_table")
     fun deleteAll()




}