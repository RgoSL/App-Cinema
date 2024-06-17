package com.example.cineko.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cineko.R
import com.example.cineko.components.AnimatedBorderCard
import com.example.cineko.components.TextFieldCustom
import com.example.cineko.ui.theme.Blue200
import com.example.cineko.ui.theme.Blue500
import com.example.cineko.ui.theme.Blue900

@Composable
fun FormLogin(){

    var username by remember{ mutableStateOf("")}
    var password by remember { mutableStateOf("")}

    Column (
        Modifier
            .fillMaxSize()
            .background(
                brush = Brush.sweepGradient(
                    listOf(
                        Color.Black,
                        Blue900,
                        Color.Black

                    )
                )
            ), Arrangement.Center, Alignment.CenterHorizontally
    ){

        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 36.sp ,
            fontFamily = FontFamily.Monospace,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.White,
                        Blue500,
                        Blue200
                    )
                )
            )
        )

        Spacer(modifier = Modifier.padding(0.dp,0.dp,0.dp,50.dp))

        AnimatedBorderCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 24.dp),
            shape = RoundedCornerShape(8.dp),
            gradient = Brush.sweepGradient(listOf(Blue500, Blue200))
        ) {

            Column(
                 modifier = Modifier.padding(all = 24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                
                TextFieldCustom(
                    value = username,
                    onValueChange = {
                        username = it
                    },
                    hint = "Username"
                )

            }
        }
    }

}

@Composable
@Preview

private fun FormLoginPreview(){
    FormLogin()
}