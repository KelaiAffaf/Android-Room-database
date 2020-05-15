package com.example.tp7
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MovieActorDao {

    @Query("SELECT * from ActeurMovie ORDER BY ActeurMovie.acteurId ASC")
   fun getAlphabetizedWords(): LiveData<List<ActeurMovie>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(am: ActeurMovie)

    @Query("DELETE FROM ActeurMovie")
    suspend fun deleteAll()
}