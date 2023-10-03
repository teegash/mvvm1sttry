package com.nate.mvvmlogin_nate.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf(TextFieldValue(""))}
    var password by remember { mutableStateOf(TextFieldValue(""))}
//    var confirmpassword by remember { mutableStateOf(TextFieldValue(""))}

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
        ) {

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Login here",
            color = Color.White,
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            )
        
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(value = email,
            onValueChange ={email=it},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter Email",
                           fontSize = 20.sp,
                           fontFamily = FontFamily.Serif,
                           color = Color.LightGray)}
        )

        OutlinedTextField(value = password,
            onValueChange = {password=it},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            label = { Text(text = "Enter Password",
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                color = Color.LightGray)}
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
        ){
            Text(text = "Click to Login", fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .height(35.dp)
        ) {
            Text(text = "Don't have an account, Click to Register",
                fontSize = 14.sp,
                color = Color.LightGray
            )
        }

//        OutlinedTextField(value = confirmpassword,
//            onValueChange = { confirmpassword=it },
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(8.dp),
//            label = { Text(text = "Confirm Password",
//                fontSize = 20.sp,
//                fontFamily = FontFamily.Serif,
//                color = Color.LightGray)}
//
//
//        )

    }


    
}

@Preview
@Composable
fun LoginScreenPrev() {
    LoginScreen()
}