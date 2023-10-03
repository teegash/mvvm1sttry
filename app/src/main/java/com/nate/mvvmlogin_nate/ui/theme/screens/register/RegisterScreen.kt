package com.nate.mvvmlogin_nate.ui.theme.screens.register

import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen() {
    var name by remember { mutableStateOf(TextFieldValue(""))}
    var email by remember { mutableStateOf(TextFieldValue(""))}
    var password by remember { mutableStateOf(TextFieldValue(""))}
    var confirmpassword by remember { mutableStateOf(TextFieldValue(""))}


    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)) {

        Spacer(modifier = Modifier.height(28.dp))

        Text(text = "Register Here",
            color = Color.White,
            fontFamily = FontFamily.Cursive,
            fontSize = 42.sp
            )

        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(value = name,
            label = { Text(text = "Enter name",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                color = Color.White
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {name=it} )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = email,
            label = { Text(text = "Enter email",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                color = Color.White
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {email=it} )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password,
            label = { Text(text = "Enter password",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                color = Color.White
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {password=it} )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = confirmpassword,
            label = { Text(text = "Re-enter password",
                fontFamily = FontFamily.Serif,
                fontSize = 20.sp,
                color = Color.White
            )},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            onValueChange = {confirmpassword=it} )

        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
              ){
            Text(text = "Click to Register", fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .height(35.dp)
                ) {
            Text(text = "Already have an account, Click to Login",
                fontSize = 14.sp,
                color = Color.LightGray
            )
        }

    }

}

@Preview
@Composable
fun Registerprev() {
    RegisterScreen()
}