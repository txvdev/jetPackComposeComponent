package com.example.jetpackcomposecomponent.video002

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun Ejercicio1() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {

        Fila("Card 01", "Card 02")
        Fila("Card 03", "Card 04")
        Fila("Card 05", "Card 06")

    }

}
@Composable
fun Fila(card1:String, card2:String) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(Color.Cyan)
    ) {
        Box(
            Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.DarkGray), contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = card1,
                Modifier
                    .fillMaxWidth()
                    .background(Color.White).height(35.dp),
                textAlign = TextAlign.Center
            )
        }
        Box(
            Modifier
                .fillMaxHeight()
                .weight(1f)
                .background(Color.Blue), contentAlignment = Alignment.BottomCenter
        ) {
            Text(
                text = card2,
                Modifier
                    .fillMaxWidth()
                    .background(Color.White).height(35.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(name = "Ejercicio", showBackground = true)
@Composable
fun PreviewEj() {
    JetPackComposeComponentTheme {
        Ejercicio1()
    }
}