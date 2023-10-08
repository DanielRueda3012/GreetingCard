package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio1.ui.theme.TRIMESTRE1Theme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            TRIMESTRE1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String,modifier: Modifier = Modifier) {

    Surface(color = Color(255,153,0) )  {
        Text(
            text = "Hello mi nombre es $name!",modifier = Modifier.padding(19.dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TRIMESTRE1Theme {
        Greeting("Daniel Rueda")
    }
}