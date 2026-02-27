package com.example.praktam2_2417051032

import Model.Food
import Model.FoodSource
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.praktam2_2417051032.ui.theme.PrakTAM2_2417051032Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrakTAM2_2417051032Theme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val food = FoodSource.dummyFood[0]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Text(text = "Nama: ${food.nama}")
        Text(text = "Deskripsi: ${food.deskripsi}")
        Text(text = "Harga: ${food.harga}")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrakTAM2_2417051032Theme {
        Greeting()
    }
}