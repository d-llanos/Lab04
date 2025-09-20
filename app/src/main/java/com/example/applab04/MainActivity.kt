package com.example.applab04

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
import com.example.applab04.ui.theme.AppLab04Theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image

import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppLab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Columna para organizar el texto y el botón uno debajo del otro
    Column(
        modifier = modifier
            .fillMaxSize() // que ocupe toda la pantalla
            .padding(16.dp), // un poco de espacio alrededor
        verticalArrangement = Arrangement.Center, // centrado vertical
        horizontalAlignment = Alignment.CenterHorizontally // centrado horizontal
    ) {
        // Texto principal
        Text(
            text = "Hello $name!"
        )

        Spacer(modifier = Modifier.height(16.dp)) // espacio entre el texto y el botón

        // Botón simple
        Button(
            onClick = { /* Acción cuando se presiona */ }
        ) {
            Text("Presióname")
        }
        // Checkbox simple
        var checked by remember { mutableStateOf(false) }
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        if (checked) {
            Text("Opción activada ")
        }
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Icono Android",
            modifier = Modifier
                .size(120.dp)
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppLab04Theme {
        Greeting("Android")
    }
}

