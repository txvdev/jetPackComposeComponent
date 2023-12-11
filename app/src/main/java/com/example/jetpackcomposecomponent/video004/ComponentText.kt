package com.example.jetpackcomposecomponent.video004

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Esto es un ejemplo")
        Text(text = "Esto es un Ejemplo", color = Color.Blue)
        Text(text = "Esto es un Ejemplo", fontWeight = FontWeight.Bold)
        Text(text = "Esto es un Ejemplo", fontWeight = FontWeight.Light)
        Text(text = "Esto es un Ejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "Esto es un Ejemplo",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "Esto es un Ejemplo",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "Esto es un Ejemplo", style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(TextDecoration.LineThrough, TextDecoration.Underline)
                )
            )
        )
        Text(text="Esto es un ejemplo", fontSize = 30.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewText() {
    JetPackComposeComponentTheme {
        MyText()
    }
}