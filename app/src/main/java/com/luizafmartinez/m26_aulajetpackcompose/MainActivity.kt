package com.luizafmartinez.m26_aulajetpackcompose

import android.graphics.fonts.FontStyle
import android.graphics.fonts.FontStyle.FONT_WEIGHT_BOLD
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.luizafmartinez.m26_aulajetpackcompose.componentes.Botao
import com.luizafmartinez.m26_aulajetpackcompose.model.Usuario
import com.luizafmartinez.m26_aulajetpackcompose.ui.theme.M26_AulaJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private val usuarios = listOf(
        Usuario("Jamilton", 36),
        Usuario("Ana", 45),
        Usuario("Maria", 35),
        Usuario("João", 22),
        Usuario("Pedro", 16),
        Usuario("Tiago", 65),
        Usuario("Joana", 70),
        Usuario("Homer", 36),
        Usuario("Marge", 45),
        Usuario("Lisa", 10),
        Usuario("Bart", 8),
        Usuario("Maggie", 1),
        Usuario("Moe", 45),
        Usuario("Lenny", 34),
        Usuario("Carl", 36),
        Usuario("Krusty", 40),
        Usuario("Apu", 30),
        Usuario("Europe", 36),
        Usuario("Nightwish", 45),
        Usuario("Yngwie Malmsteen", 35),
        Usuario("Sonata Arctica", 22),
        Usuario("Lacuna Coil", 16),
        Usuario("Stratovarius", 65),
        Usuario("Black Sabbath", 70),
        Usuario("Iron Maiden", 36),
        Usuario("Deep Purple", 45),
        Usuario("Halloween", 10),
        Usuario("iced Earth", 8),
        Usuario("Marillion", 1),
        Usuario("yes", 45),
        Usuario("Dream Theater", 34),
        Usuario("Axel Rudi Pell", 36),
        Usuario("Rainbow", 40),
        Usuario("Whitesnake", 30),
        Usuario("In Flames", 30),
        Usuario("Angra", 30),
        Usuario("Sepultura", 30),
        Usuario("Metallica", 30),
        Usuario("The Warning", 30),
        Usuario("Imperial Age", 30),
        Usuario("Madison", 30),
        Usuario("A-ha", 30),
        Usuario("Dire Straits", 30),
        Usuario("Pink Floyd", 30),
        Usuario("Roxette", 30),
        Usuario("Capital inicial", 30),
        Usuario("Barão Vermelho", 30),
        Usuario("Ira", 30),
        Usuario("Engenheiros do Hawaii", 30),
        Usuario("Legião Urbana", 30),
    )

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
    } // Fim onCreate


    @Composable
    fun SegundoApp() {}

    @Preview
    @Composable
    fun SegundoAppPreview() {
        SegundoApp()
    }


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
            //LazyRow(
            //LazyColumn(
           /* LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier
                    .padding(16.dp)
            )*/
            LazyHorizontalGrid(
                //columns = GridCells.Fixed(3),
                rows = GridCells.Fixed(6),
                modifier = Modifier
                    .padding(16.dp)
                    //.height(600.dp)
            ) {
                items(usuarios.size) { indice ->

                    val nome = usuarios[indice].nome
                    val idade = usuarios[indice].idade

                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.carro),
                            //contentDescription = "Imagem de um avião"
                            contentDescription = null,
                            modifier = Modifier
                                .padding(8.dp)
                                .height(80.dp)
                                .width(80.dp),
                            contentScale = ContentScale.Crop,
                            //alignment = Alignment.TopCenter
                        )

                        Text(
                            text = "$nome"
                        )
                    }

                    /*Row(
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.carro),
                            //contentDescription = "Imagem de um avião"
                            contentDescription = null,
                            modifier = Modifier
                                .height(80.dp)
                                .width(80.dp),
                            contentScale = ContentScale.Crop,
                            //alignment = Alignment.TopCenter
                        )
                        Text(
                            text = "$nome - $idade",
                            fontSize = 32.sp,
                            modifier = Modifier
                                .padding( start = 16.dp )
                        )
                    } // Fim Row
                       */

                    /*Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(Color.Red)
                    )*/

                    /*Text(
                        text = "------",
                        fontSize = 32.sp
                    )*/

                }
            }

            /*
            for (i in 1..4) {
                Image(
                    painter = painterResource(id = R.drawable.carro),
                    //contentDescription = "Imagem de um avião"
                    contentDescription = null,
                    modifier = Modifier
                        .height(200.dp)
                        .width(200.dp)
                        .border(2.dp, Color.Red),
                    contentScale = ContentScale.Crop,
                    //alignment = Alignment.TopCenter
                )
            }
            */

        }

        /*Image(
            painter = painterResource(id = R.drawable.carro),
            //contentDescription = "Imagem de um avião"
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .border(2.dp, Color.Red),
            contentScale = ContentScale.Crop,
            //alignment = Alignment.TopCenter
        )

        Icon(
            //painter = painterResource(id = R.drawable.ic_alarm_24),
            imageVector = Icons.Default.Lock,
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .border(2.dp, Color.Red)
        )

        Button(onClick = { }) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if ( true ) {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = null
                    )
                }

                Text(text = "Desbloquear")
            }

        }

       Text(text = "Joseph Nut", fontSize = 20.sp)

        Column(modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            //.clip(CircleShape)
           //.clip(RoundedCornerShape(20.dp))
            //.clip(RoundedCornerShape(
            .clip(CutCornerShape(
                topStart = 20.dp,
                topEnd = 8.dp,
                bottomStart = 20.dp,
                bottomEnd = 8.dp)
            )
            //.clip(CutCornerShape(20.dp))
           //.border(2.dp, Color.Red, RoundedCornerShape(20.dp))
            .clip(RoundedCornerShape(20.dp))
            .border(2.dp, Color.Red, CircleShape)
            .clip(CircleShape)
            .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "JN", fontSize = 32.sp)
        }*/

        // Fim Column

        /*
           //Row
           Column(
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
            }

            Text(
                text = "John Doe",
                color = Color.Blue
            )

            Button(onClick = {  }) {
                Text(
                    text = "John Doe",
                    color = Color.White
                )
            }
            */

    }

    @Preview
    @Composable
   fun PrimeiroAppPreview() {
       PrimeiroApp()
    }

    /*
    @Composable
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
    }
    */

} // Fechamento MainActivity
