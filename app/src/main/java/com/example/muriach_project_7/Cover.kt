package com.example.muriach_project_7

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
In this screen i can see the COVER where we will see the exercises
*/

@Composable
fun Cover(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
                .padding(bottom = 30.dp)
        )

        Text(
            text = "Exercises Project 7",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = { navController.navigate("Exercise1") },
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 1")
        }

        Button(
            onClick = { navController.navigate("Exercise2") },
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 2")
        }

        Button(
            onClick = {navController.navigate("Exercise3")},
            modifier = Modifier.width(250.dp),
        ) {
            Text(text = "Exercise 3")
        }

        Button(
            onClick = {navController.navigate("Exercise4")},
            modifier = Modifier.width(250.dp)
        ) {
            Text(text = "Exercise 4")
        }
    }
}