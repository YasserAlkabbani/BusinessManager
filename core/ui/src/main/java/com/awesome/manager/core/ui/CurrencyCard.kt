package com.awesome.manager.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.awesome.manager.core.designsystem.component.AmCard
import com.awesome.manager.core.designsystem.component.AmImage
import com.awesome.manager.core.designsystem.component.AmText

@Composable
fun CurrencyCard(modifier: Modifier,countryName:String, currencyName:String, currencySympl:String, imageUrl:String,onClick:()->Unit){
    AmCard(
        modifier = modifier,
        onClick = {},
        content = {
            Row(
                modifier=Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AmImage(modifier = Modifier.size(40.dp), imageUrl = imageUrl)
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    AmText(text = currencySympl)
                    Row {
                        AmText(text = countryName)
                        AmText(text = ", ")
                        AmText(text = currencyName)
                    }
                }
            }
        },
    )
}

@Preview
@Composable
fun CurrencyCardPreview(){
    Box(Modifier.width(250.dp)) {
        CurrencyCard(modifier=Modifier.fillMaxWidth(),"Syria","Syrian Pound","SYP","", { })
    }
}