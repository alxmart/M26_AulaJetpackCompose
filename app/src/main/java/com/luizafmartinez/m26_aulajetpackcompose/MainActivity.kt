package com.luizafmartinez.m26_aulajetpackcompose

import android.graphics.fonts.FontStyle
import android.graphics.fonts.FontStyle.FONT_WEIGHT_BOLD
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
    /*Text(
        text = "John Doe",
        color = Color.Blue
    )*/
    Button(onClick = {  }) {
        Text(
            text = "John Doe",
            color = Color.White
        )
    }
}

@Preview
@Composable
fun PrimeiroAppPreview() {
    PrimeiroApp()
}















