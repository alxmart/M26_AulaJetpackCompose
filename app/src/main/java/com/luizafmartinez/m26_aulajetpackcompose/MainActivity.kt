package com.luizafmartinez.m26_aulajetpackcompose

import android.graphics.fonts.FontStyle
import android.graphics.fonts.FontStyle.FONT_WEIGHT_BOLD
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luizafmartinez.m26_aulajetpackcompose.componentes.Botao
import com.luizafmartinez.m26_aulajetpackcompose.ui.theme.M26_AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            M26_AulaJetpackComposeTheme {
                PrimeiroApp()
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
            } // Fechamento Theme
        }
    }

    /*@Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }*/

    /*@Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        M26_AulaJetpackComposeTheme {
            Greeting("Android")
        }
    }*/

} // Fechamento MainActivity

@Composable
fun PrimeiroApp() {

    Column(
        modifier = Modifier
            /* .width(200.dp)
            .height(200.dp)*/
            .background(Color.Gray)
            .border(2.dp, Color.Red)
            //.padding(30.dp, 10.dp)
            .padding(30.dp)
            //.padding(top = 30.dp, end = 30.dp)
            /*.border(2.dp, Color.Green)
            .padding(30.dp, 10.dp)
            .border(2.dp, Color.Magenta)*/
            .fillMaxWidth()
            .fillMaxHeight()
    ) {




        /*Text(text = "Joseph Nut", fontSize = 20.sp)

        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            //.clip(CircleShape)
           //.clip(RoundedCornerShape(20.dp))
            //.clip(RoundedCornerShape(
            *//*.clip(CutCornerShape(
                topStart = 20.dp,
                topEnd = 8.dp,
                bottomStart = 20.dp,
                bottomEnd = 8.dp)
            )*//*
            //.clip(CutCornerShape(20.dp))
            *//*.border(2.dp, Color.Red, RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(20.dp))*//*
            .border(2.dp, Color.Red, CircleShape)
            .clip(CircleShape)
            .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "JN", fontSize = 32.sp)
        }*/
    }

    //Row
    /*Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.Gray),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
        //horizontalArrangement = Arrangement.SpaceEvenly,
        //verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Jamilton", fontSize = 20.sp)
        Text(text = "Ana",fontSize = 20.sp)
        //Text(text = "João",fontSize = 20.sp)
       Botao(texto = "Jamilton") {
            println("executou")
        }
    }*/

    /*Text(
        text = "John Doe",
        color = Color.Blue
    )*/

    /*Button(onClick = {  }) {
        Text(
            text = "John Doe",
            color = Color.White
        )
    }*/
}

@Preview
@Composable
fun PrimeiroAppPreview() {
    PrimeiroApp()
}