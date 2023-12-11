package com.example.jetpackcomposecomponent.video002

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun Card() {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Blue), contentAlignment = Alignment.BottomCenter
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Red).height(45.dp), contentAlignment = Alignment.Center) {
            Text(text = "Card 01")
        }
    }
}

@Preview()
@Composable
fun PreviewCard() {
    JetPackComposeComponentTheme {
        Card()
    }
}