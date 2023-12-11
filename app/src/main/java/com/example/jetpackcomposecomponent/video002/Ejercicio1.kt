package com.example.jetpackcomposecomponent.video002

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun MyComplexLayoutEj() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.CenterStart
        ) {
            Text(text = "Ejemplo 1")
        }
        Spacer(
            modifier = Modifier
                .width(0.dp)
                .height(15.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Blue)
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Red)
                    .weight(1f), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Spacer(modifier = Modifier
                .width(10.dp)
                .height(0.dp))
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Green)
                    .weight(1f), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        MySpacer(15)
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 3")
        }
    }
}

@Composable
fun MySpacer(size: Int) {
    Spacer(
        modifier = Modifier
            .width(0.dp)
            .height(size.dp)
    )
}

@Preview(name = "Ejercicio 01")
@Composable
fun PreviewEj1() {
    JetPackComposeComponentTheme {
        MyComplexLayoutEj()
    }
}