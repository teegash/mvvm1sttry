package com.nate.mvvmlogin_nate.ui.theme.screens.calc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.navigation.ROUTE_LOGIN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(navController: NavHostController) {

    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)) {

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Answer",
            color = Color.White,
            fontSize = 30.sp)

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(value = firstnum,
            onValueChange = {firstnum=it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Enter First Number",
                color = Color.Gray,
                fontSize = 18.sp)}
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = secondnum,
            onValueChange = {secondnum=it},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text(text = "Enter Second Number",
                color = Color.Gray,
                fontSize = 18.sp)}
        )

        Spacer(modifier = Modifier.height(25.dp))

        Row {
            Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(120.dp)
                    .padding(10.dp)
            ){
                Text(text = "+", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.width(15.dp))

            Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(120.dp)
                    .padding(10.dp)
            ){
                Text(text = "-", fontSize = 20.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(120.dp)
                    .padding(10.dp)
            ){
                Text(text = "*", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.width(15.dp))

            Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(120.dp)
                    .padding(10.dp)
            ){
                Text(text = "/", fontSize = 20.sp, color = Color.White)
            }
        }


    }
    
}

@Preview
@Composable
fun Calculatorpreview() {

    CalculatorScreen(rememberNavController())
    
}