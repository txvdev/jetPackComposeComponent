package com.example.jetpackcomposecomponent.video008

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme
import kotlin.math.roundToLong


@Composable
fun MyProgressAdvance() {

    var progressStatus by rememberSaveable {
        mutableStateOf(0F)
    }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progressStatus)
        LinearProgressIndicator(
            progress = progressStatus,
            modifier = Modifier.padding(top = 32.dp),
            color = Color.Red,
            trackColor = Color.Green
        )
        Text(
            text = "${(progressStatus * 100).roundToLong()}%",
            Modifier.padding(bottom = 5.dp, top = 15.dp)
        )
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                if(progressStatus != 1F) {
                    progressStatus += 0.2F
                } else {
                    progressStatus = 1F
                }
                             },
                Modifier.padding(2.dp)) {
                Text(text = "Incrementar")
            }
            Button(onClick = {
                if(progressStatus <= 0.0F){
                    progressStatus = 0.0F
                } else {
                    progressStatus -= 0.2F
                }
                             },
                Modifier.padding(2.dp)) {
                Text(text = "Reducir")
            }
        }
    }
}

@Composable
fun MyProgress() {

    var showLoading by rememberSaveable {
        mutableStateOf(false)
    }

    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                trackColor = Color.Green
            )
        }

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Cargar perfil")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProgressBar() {
    JetPackComposeComponentTheme {
        MyProgressAdvance()
    }
}