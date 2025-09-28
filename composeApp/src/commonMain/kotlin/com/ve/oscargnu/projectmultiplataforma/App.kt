package com.ve.oscargnu.projectmultiplataforma

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import projectmultiplataforma.composeapp.generated.resources.Res
import projectmultiplataforma.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    Column (modifier = Modifier.fillMaxSize()) {
        Text("Bienvenidos")
        Text("Curso Kotlin Multiplataforma en compose")

    }
}