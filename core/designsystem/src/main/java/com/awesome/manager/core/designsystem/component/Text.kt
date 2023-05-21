package com.awesome.manager.core.designsystem.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.awesome.manager.core.designsystem.text.AmText

@Composable
fun AmText(amText: AmText){
    Text(text = amText.asText())
}