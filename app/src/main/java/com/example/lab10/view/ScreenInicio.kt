package com.example.lab10.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lab10.R

@Composable
fun ScreenInicio() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Cargar y mostrar la imagen desde los recursos drawable usando painterResource
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Reemplaza 'tu_imagen' por el nombre del recurso drawable
            contentDescription = "Imagen de ejemplo",
            modifier = Modifier
                .fillMaxSize()

        )
    }
}