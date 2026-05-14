

package com.example.praktam2_2417051032.data.model

import com.google.gson.annotations.SerializedName

data class Book(

    @SerializedName("nama")
    val nama: String,

    @SerializedName("pencipta")
    val pencipta: String,

    @SerializedName("deskripsi")
    val deskripsi: String,

    @SerializedName("gambar")
    val gambar: String
)