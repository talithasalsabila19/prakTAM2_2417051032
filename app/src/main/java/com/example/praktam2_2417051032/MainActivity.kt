package com.example.praktam2_2417051032

import Model.Book
import Model.BookSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.praktam2_2417051032.ui.theme.PrakTAM2_2417051032Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            PrakTAM2_2417051032Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { paddingValues ->
                    BookList(
                        modifier = Modifier.padding(paddingValues)
                    )
                }
            }
        }
    }
}

@Composable
fun BookList(modifier: Modifier = Modifier) {

    val books = BookSource.dummyBook

    LazyColumn(
        modifier = modifier.padding(16.dp)
    ) {
        items(books) { book ->
            BookItem(book)
        }
    }
}

@Composable
fun BookItem(book: Book) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
    ) {

        Column(
            modifier = Modifier.padding(12.dp)
        ) {

            Image(
                painter = painterResource(id = book.gambar),
                contentDescription = book.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(text = "Judul Novel : ${book.nama}")
            Text(text = "Pencipta : ${book.pencipta}")
            Text(text = "Sinopsis : ${book.deskripsi}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBookItem() {
    PrakTAM2_2417051032Theme {
        BookItem(BookSource.dummyBook[0])
    }
}