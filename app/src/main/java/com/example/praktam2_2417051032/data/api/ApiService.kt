package com.example.praktam2_2417051032.data.api

import com.example.praktam2_2417051032.data.model.Book
import retrofit2.http.GET

interface ApiService {

    @GET("judul_buku.json")
    suspend fun getBooks(): List<Book>

}