package com.ve.oscargnu.projectmultiplataforma.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ve.oscargnu.projectmultiplataforma.getColorsTheme

@Composable
fun ExpensesScreen(){
        val colors = getColorsTheme()
    LazyColumn (
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        stickyHeader {
            Column (
                modifier = Modifier.background(colors.backgroundColor)) {
                ExpensesTotalHeader(1023.3)
                AllExpensesHeader()

            }
        }
        items(emptyList<String>()){

        }
    }
}

@Composable
fun ExpensesTotalHeader(total: Double){
    Card(
        shape = RoundedCornerShape(30),
        colors = CardDefaults.cardColors(
            containerColor = Color.Black),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)){
        Box (
            modifier = Modifier.fillMaxWidth()
                .height(130.dp)
                .padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text (
                "$$total",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
                )
            Text(modifier = Modifier.align(Alignment.CenterEnd), text = "USD", color = Gray)
        }
    }
}

@Composable
fun AllExpensesHeader(){
    val colors = getColorsTheme()

    Row (
        modifier = Modifier.padding(vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            modifier = Modifier.weight(1f),
            text = "All Expenses",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            color = colors.textColor

        )
        Button(
            shape = RoundedCornerShape(56),
            onClick = {
            //Crear click mas adelante,
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
            enabled = false
        ) {
            Text(text = "View All")
        }
        
    }
}