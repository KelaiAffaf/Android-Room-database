package com.example.tp7



import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Actor::class, Movie::class, ActeurMovie::class],version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getMovieDo():MovieDao
    abstract fun getActorDo():ActorDao
    abstract fun getMovieActorDo():MovieActorDao

    companion object {
        @Volatile private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            AppDatabase::class.java, "app.db")
            .build()



    }
}



