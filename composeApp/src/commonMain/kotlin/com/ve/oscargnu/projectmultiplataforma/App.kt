package com.ve.oscargnu.projectmultiplataforma


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp

import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {
        Column (modifier = Modifier.fillMaxSize()) {
        Text("Bienvenidos")
        Text("Curso Kotlin Multiplataforma en compose")
    }

    }
}

