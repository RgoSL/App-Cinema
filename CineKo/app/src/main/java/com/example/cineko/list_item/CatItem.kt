package com.example.cineko.list_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cineko.R
import com.example.cineko.model.Catalog

@Composable
fun CatItem(
    cat: Catalog

){

    val  imagemMovie = cat.imgCat
    val movieName = cat.movName
    val descriptionMovie = cat.movDescription
    val rating = cat.parRating

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(0.dp, 10.dp, 0.dp, 10.dp)
    ){
        val(
            imgCat,
            txtMovName,
            txtMovDescription,
            txtParRating,
            btSession,
            containerImg,
            rowItem
        ) = createRefs()

        Card (
            modifier = Modifier
                .constrainAs(containerImg) {
                    top.linkTo(parent.top, 0.dp)
                    start.linkTo(parent.start, 0.dp)

                }
                .size(130.dp)
                .padding(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = ShapeDefaults.Medium,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )
        ){

        }

        Image(
            painter = painterResource(id = R.drawable.movie1),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(imgCat) {
                    top.linkTo(containerImg.top, 0.dp)
                    start.linkTo(containerImg.start, 0.dp)
                    end.linkTo(containerImg.end, 0.dp)
                    bottom.linkTo(containerImg.bottom, 0.dp)

                }
                .size(85.dp)

        )

        Text(
            text = "Movie 1",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.constrainAs(txtMovName){
                top.linkTo(parent.top,30.dp)
                start.linkTo(containerImg.end,0.dp)
            }
        )

        Text(
            text = "The standard chunk of Lorem Ipsum used since the 1500s.",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(txtMovDescription) {
                    top.linkTo(txtMovName.bottom)
                    start.linkTo(containerImg.end)
                    end.linkTo(parent.end)
                }
                .padding(65.dp, 10.dp, 40.dp, 0.dp),
            maxLines = 3

        )

        Text(
            text = "+12",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.constrainAs(txtParRating){
                top.linkTo(txtMovDescription.bottom,20.dp)
                start.linkTo(containerImg.end,0.dp)
            }
        )
        
        Button(
            onClick = {



            },
            modifier = Modifier
                .height(45.dp)
                .constrainAs(btSession) {
                    top.linkTo(txtMovDescription.bottom, 10.dp)
                    start.linkTo(txtParRating.end, 10.dp)
                    end.linkTo(parent.end, 10.dp)

                },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF44336)
            )
        ){
            Text(
                text = "Sessions",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Row (
            modifier = Modifier
                .width(350.dp)
                .height(3.dp)
                .background(Color.White)
                .constrainAs(rowItem) {
                    top.linkTo(txtParRating.bottom, 30.dp)
                    start.linkTo(parent.start, 20.dp)
                    end.linkTo(parent.end, 20.dp)
                }
        ){

        }
    }
}

