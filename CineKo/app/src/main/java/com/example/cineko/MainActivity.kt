package com.example.cineko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.cineko.components.AnimatedBorderCard
import com.example.cineko.components.TextFieldCustom
import com.example.cineko.list_item.CatItem
import com.example.cineko.model.Catalog
import com.example.cineko.screens.FormLogin


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        CatList()
            }
        }
    }

@Composable
private fun CatList(){
    val catList: MutableList<Catalog> = mutableListOf(
        Catalog(
            imgCat = R.drawable.movie1,
            movName = "Movie1",
            movDescription = "The standard chunk of Lorem Ipsum used since the 1500s.",
            parRating = "+12"
        ),
        Catalog(
            imgCat = R.drawable.movie2,
            movName = "Movie2",
            movDescription = "The standard chunk of Lorem Ipsum used since the 1500s.",
            parRating = "L"
        ),
        Catalog(
            imgCat = R.drawable.movie3,
            movName = "Movie3",
            movDescription = "The standard chunk of Lorem Ipsum used since the 1500s.",
            parRating = "+14"
        ),
        Catalog(
            imgCat = R.drawable.movie4,
            movName = "Movie4",
            movDescription = "The standard chunk of Lorem Ipsum used since the 1500s.",
            parRating = "+16"
        ),
        Catalog(
            imgCat = R.drawable.movie5,
            movName = "Movie5",
            movDescription = "The standard chunk of Lorem Ipsum used since the 1500s.",
            parRating = "+18"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)

    ){
    LazyColumn{
        itemsIndexed(catList){position,catalog ->
            CatItem(catalog)

        }
      }
    }
}
