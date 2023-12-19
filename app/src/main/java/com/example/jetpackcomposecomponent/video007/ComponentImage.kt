package com.example.jetpackcomposecomponent.video007

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponent.R
import com.example.jetpackcomposecomponent.ui.theme.JetPackComposeComponentTheme

@Composable
fun MyImage() {
    //Imagenes
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "my image",
        alpha = 0.5F
    )
}

//Imagenes Circulares
@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "my image",
        /*modifier = Modifier.clip(RoundedCornerShape(25f))*/
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

//Iconos
@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icono",
        tint = Color.Red
        )
}

@Preview(showBackground = true)
@Composable
fun PreviewImage() {
    JetPackComposeComponentTheme {
        MyIcon()
    }
}