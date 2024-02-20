package com.example.tarjetapresentacion

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tarjeta(
                        "paula",
                        "estudia",
                        123,
                        "paperec",
                        "pape@uni.es")
                }
            }
        }
    }
}

@Composable
fun Tarjeta(nombre:String,
            cargo:String,
            telefono:Int,
            arroba:String,
            correo:String,
            modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(
                top = 100.dp
            )
    ){
        Row(
            horizontalArrangement = Arrangement.Center
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Image(
                    painter = painterResource(R.drawable.android_logo),
                    contentDescription = null,
                    modifier = Modifier
                        .background(Color.Gray)
                        .padding(
                            start = 20.dp,
                            end = 20.dp
                        )
                )
                Text(
                    text = nombre,
                    fontSize = 70.sp
                )
                Text (
                    text = cargo,
                    fontSize = 40.sp
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(
                    top = 50.dp
                ),
            horizontalArrangement = Arrangement.Center
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                var tlf = "+34 ${telefono}"
                Text (
                    text = tlf
                )
                var arr = "@$arroba"
                Text (
                    text = arr
                )
                Text (
                    text = correo
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Tarjeta(
            "paula",
            "estudia",
            123,
            "paperec",
            "pape@uni.es")
    }
}