package com.nate.mvvmlogin_nate.ui.theme.screens.buy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.R

@Composable
fun BuyingScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Spacer(modifier = Modifier.height(30.dp))   // This is a spacer that gives some room height wise


        Text(
            text = "THANKS, COME AGAIN!!!",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(100.dp))

        Image(
            painter = painterResource(id = R.drawable.hgh),
            contentDescription = "Cow",
            modifier = Modifier.fillMaxWidth()
                .padding(20.dp)
                .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BuyingPreview() {
    BuyingScreen(rememberNavController()) // Have to call the Home function(the function above if i want to see preview)
}