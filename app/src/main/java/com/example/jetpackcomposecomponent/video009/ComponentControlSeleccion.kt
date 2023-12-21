package com.example.jetpackcomposecomponent.video009

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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

@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Switch(
        checked = state,
        onCheckedChange = { state != state },
        enabled = true,
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,

        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiPrueba() {

    var myText by rememberSaveable {
        mutableStateOf("")
    }

    var state by rememberSaveable {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = myText,
            onValueChange = { myText = it },
            modifier = Modifier.padding(5.dp)
        )

        Button(
            modifier = Modifier.padding(5.dp),
            onClick = {
                state = !state
                myText = ""
            }
        ) {
            Text(text = "Enviar")
        }

        if (state) {
            Text(text = myText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPrueba() {
    JetPackComposeComponentTheme {
        MiPrueba()
    }
}