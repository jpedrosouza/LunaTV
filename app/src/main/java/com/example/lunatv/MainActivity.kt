package com.example.lunatv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Button
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Surface
import coil.compose.AsyncImage
import com.example.lunatv.ui.theme.LunaTvTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalTvMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LunaTvTheme {
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        shape = RectangleShape
                ) {
                    Greeting("Luninha")
                }
            }
        }
    }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
                modifier = modifier.padding(vertical = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Welcome $name!",
                    modifier = modifier,
                )
                Spacer(modifier = modifier.padding(vertical = 8.dp))
                Text(
                    text = "Happy to see you here!",
                    modifier = modifier,
                    style = MaterialTheme.typography.bodySmall,
                )
            }
            Row {
                Button(onClick = { println("Clicked at login button") }) {
                    Text(text = "Login")
                }
                Spacer(modifier = modifier.padding(horizontal = 8.dp))
                Button(onClick = { println("Clicked at register button") }) {
                    Text(text = "Register")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LunaTvTheme {
        Greeting("Android")
    }
}