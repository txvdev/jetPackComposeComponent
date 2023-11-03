package com.example.jetpackcomposecomponent.video002

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun MyBox() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Cyan)
        )
    }
}

@Composable
fun MyBoxText() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterEnd
    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
        ) {
            Text("Esto es un Ejemplo")
        }
    }
}

@Composable
fun MyBoxTextScroll() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterEnd
    ) {
        Box(
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            Text("Esto es un Ejemplo")
        }
    }
}

@Composable
fun MyBoxCenter() {
    /* Box(
         modifier = Modifier.fillMaxSize(),
         contentAlignment = Alignment.CenterEnd
     ) {
         Box(
             modifier = Modifier
                 .width(30.dp)
                 .height(30.dp)
                 .background(Color.Cyan)
                 .verticalScroll(
                     rememberScrollState()
                 )
         ){
             Text("Esto es un Ejemplo")
         }
     }*/
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(300.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Otro Ejemplo de texto")
        }
    }
}

//Previus
@Preview(
    showBackground = true,
    name = "Box"
)
@Composable
fun GreetingPreview() {
    JetPackComposeComponentTheme {
        MyBox()
    }
}

@Preview(
    showBackground = true,
    name = "Box con Texto"
)
@Composable
fun PreviewBoxText() {
    JetPackComposeComponentTheme {
        MyBoxText()
    }
}

@Preview(
    showBackground = true,
    name = "Box con Texto"
)
@Composable
fun PreviewBoxTextScroll() {
    JetPackComposeComponentTheme {
        MyBoxTextScroll()
    }
}

@Preview(
    showBackground = true,
    name = "Box con Texto"
)
@Composable
fun PreviewBoxCenter() {
    JetPackComposeComponentTheme {
        MyBoxCenter()
    }
}