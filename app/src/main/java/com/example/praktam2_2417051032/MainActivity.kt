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
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {
            Text(
                text = "Rekomendasi Novel",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))
        }

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
            .padding(bottom = 20.dp)
    ) {

        Column(
            modifier = Modifier.padding(12.dp)
        ) {

            Image(
                painter = painterResource(id = book.gambar),
                contentDescription = book.nama,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = book.nama,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )

            Text(
                text = "Penulis : ${book.pencipta}",
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = book.deskripsi,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Baca Sekarang")
            }
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