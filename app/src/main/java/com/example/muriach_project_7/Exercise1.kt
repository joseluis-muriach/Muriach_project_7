package com.example.muriach_project_7

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*
In this exercise you introduce three numbers and the result will be the average of three numbers
*/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise1(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.1'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 30.sp
        ),
        color = Color.Gray,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var firstNumber by remember { mutableStateOf("") }
        var secondNumber by remember { mutableStateOf("") }
        var thirdNumber by remember { mutableStateOf("") }
        var average by remember { mutableStateOf("") }
        val numberThree by remember { mutableStateOf("3") }


        OutlinedTextField(value = firstNumber,
            onValueChange = {firstNumber = it},
            label = {
                Text("Introduce first number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(value = secondNumber,
            onValueChange = {secondNumber = it},
            label = {
                Text("Introduce second number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(value = thirdNumber,
            onValueChange = {thirdNumber = it},
            label = {
                Text("Introduce third number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )


        var textOfResult by remember { mutableStateOf("") }
        Button(onClick = {
            average = (
                    (firstNumber.toDouble() + secondNumber.toDouble() +
                            thirdNumber.toDouble()) / numberThree.toDouble()).toString()

            if (average.toDouble() >= 7) {
                textOfResult = "PROMOTE"
            } else if(average.toDouble() >= 4 && average.toDouble() < 7) {
                textOfResult = "REGULAR"
            } else if(average.toDouble() < 4){
                textOfResult = "REPROBED"
            }
        },
            modifier = Modifier.padding(10.dp)) {

            Text(text = "Calculate")
        }

        Text(text = textOfResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp)
        )

        //This button allows to go to "Cover" (also in Exercises 2,3 and 4)
        Button(
            onClick = {navController.navigate("Cover")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)

        ) {
            Text(text = "Previous")
        }
    }
}