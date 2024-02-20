package br.senai.sp.jandira.calculadoradeimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.calculadoradeimc.ui.theme.CalculadoraDeIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraDeIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE61753))
        ){
            Image(painterResource(id = R.drawable.bmi),
                contentDescription = "",
                modifier = Modifier
                    .width(70.dp)
                    .height(100.dp)
                    .padding(start = 20.dp)
            )
            Text(
                text = "Calculadora IMC",
                color = Color.White

            )
        }
        Card(
            modifier = Modifier
                .width(350.dp)
                .height(400.dp)
                .padding(start = 30.dp)
                .offset(y = -50.dp)

        )
        {
            Column(
                modifier = Modifier.padding(start = 20.dp)
            ) {

                Text(
                text = "Seus Dados"
                )
                Text(
                text = "Seu Peso:"
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Seu Peso em kg")
                    },

                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                text = "Sua Altura:"
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "Sua Altura em cm")
                    },
                )
                Button(
                    onClick = { /*TODO*/ },
                    ) {
                    Text(text = "Calcular")
                    
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraDeIMCTheme {
        Greeting()
    }
}