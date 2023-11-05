package com.example.jetpackcomposecomponent.video002

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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

/*
* Carpeta 02-Layouts
* Video 001 Box
* */
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

/*
* Carpeta 02-Layouts
* Video 002 Column
* */

@Composable
fun MyColumn() {
    Column(Modifier.fillMaxSize()) {
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .weight(2f)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Cyan)
                .weight(1f)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Blue)
                .weight(1f)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
                .weight(2f)
        )
    }
}

@Composable
fun MyColumn2() {
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Cyan)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Blue)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Green)
        )
    }
}

@Composable
fun MyColumn3() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo1", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo2", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo3", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo4", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo5", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo6", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo7", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo8", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo9", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            text = "Ejemplo10", modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
    }
}

/*
* Carpeta 02-Layouts
* Video 003 Row
* */

@Composable
fun MyRow() {
    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(text = "Ejemplo1")
        Text(text = "Ejemplo2")
        Text(text = "Ejemplo3")
    }
}

@Composable
fun MyRow2() {
    Row(Modifier.fillMaxSize()) {
        Text(text = "Ejemplo1", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo2", modifier = Modifier.weight(1f))
        Text(text = "Ejemplo3", modifier = Modifier.weight(1f))
    }
}

@Composable
fun MyRow3() {
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(text = "Ejemplo1", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo2", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(100.dp))
        Text(text = "Ejemplo6", modifier = Modifier.width(100.dp))
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
        MyRow3()
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