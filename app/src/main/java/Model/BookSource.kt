package Model

import com.example.praktam2_2417051032.R

object BookSource {

    val dummyBook = listOf(

        Book(
            nama = "Little Women",
            pencipta = "Louisa May Alcott",
            deskripsi = "Kisah empat saudari March yang tumbuh bersama menghadapi kehidupan, cinta, dan impian mereka.",
            gambar = R.drawable.littlewomen
        ),

        Book(
            nama = "Pride and Prejudice",
            pencipta = "Jane Austen",
            deskripsi = "Cerita romantis Elizabeth Bennet dan Mr. Darcy yang dipenuhi kesalahpahaman dan prasangka sosial.",
            gambar = R.drawable.prideprejudice
        ),

        Book(
            nama = "The Secret Garden",
            pencipta = "Frances Hodgson Burnett",
            deskripsi = "Seorang gadis menemukan taman rahasia yang mengubah hidupnya dan orang-orang di sekitarnya.",
            gambar = R.drawable.thesecretgarden
        )
    )
}