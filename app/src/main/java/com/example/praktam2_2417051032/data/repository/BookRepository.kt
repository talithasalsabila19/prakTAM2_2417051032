package com.example.praktam2_2417051032.data.repository

import com.example.praktam2_2417051032.data.api.RetrofitClient
import com.example.praktam2_2417051032.data.model.Book

class BookRepository {

    suspend fun getBooks(): List<Book> {

        return try {

            RetrofitClient.instance.getBooks()

        } catch (e: Exception) {

            emptyList()
        }
    }
}