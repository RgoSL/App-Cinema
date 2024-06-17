package com.example.cineko

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cineko.components.AnimatedBorderCard
import com.example.cineko.components.TextFieldCustom
import com.example.cineko.screens.FormLogin


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormLogin()
            AnimatedBorderCard {}

            }
        }
    }

