package com.example.uitesting.data.source

import com.example.uitesting.data.Movie

interface MoviesDataSource {

    fun getMovie(movieId: Int): Movie?
}