package com.ogtulashvili.englishland.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WordsList(modifier: Modifier){
    Column(modifier = Modifier.fillMaxSize()) {

        Text(text = "Word from API")

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = "Word from API")
    }
}