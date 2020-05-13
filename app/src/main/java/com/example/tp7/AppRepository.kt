package com.example.tp7

class AppRepository(private val actorDao: ActorDao, private val movieDao: MovieDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.

}