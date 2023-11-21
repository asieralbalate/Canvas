package com.example.canvas

import android.annotation.SuppressLint
import android.graphics.Point
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Portada(navController: NavHostController) {
    Canvas(modifier = Modifier.fillMaxSize()) {
        val mySize = 50F
        val myMargin = 50F
        drawRect(
            color = Color.Red,
            topLeft = Offset(myMargin, myMargin),
            size = Size(mySize, mySize)
        )
        drawRect(
            color = Color.Blue,
            topLeft = Offset(size.width - myMargin - mySize, myMargin),
            size = Size(mySize, mySize)
        )
        drawRect(
            color = Color.Green,
            topLeft = Offset(myMargin, size.width - myMargin - mySize),
            size = Size(mySize, mySize)
        )
        drawRect(
            color = Color.Yellow,
            topLeft = Offset(size.width - myMargin - mySize, size.width - myMargin - mySize),
            size = Size(mySize, mySize)
        )
        drawPoints(
            points = listOf(Offset(size.width / 2F, size.width / 2F)),
            pointMode = PointMode.Points,
            strokeWidth = 30f,
            color = Color.Cyan
        )
        drawCircle(
            color = Color.Magenta,
            radius = (size.width / 2F) - (myMargin * 3),
            center = Offset(size.width / 2F, size.width / 2F),
            style = Stroke(10f)
        )

    }

}