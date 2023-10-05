package com.nate.mvvmlogin_nate.ui.theme.screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.R
import com.nate.mvvmlogin_nate.navigation.ROUTE_BUYING
import com.nate.mvvmlogin_nate.navigation.ROUTE_LOGIN

@Composable
fun ProductScreen(navController: NavHostController){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Spacer(modifier = Modifier.height(30.dp))   // This is a spacer that gives some room height wise

        Text(
            text = "PRODUCTS",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(30.dp))
    }
    Row {

        Column {



        Spacer(modifier = Modifier.height(100.dp))


        Image(
            painter = painterResource(id = R.drawable.bi),
            contentDescription = "Cow",
            modifier = Modifier
                .width(150.dp)
                .padding(20.dp)
                .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

        )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))


            Image(
                painter = painterResource(id = R.drawable.bi),
                contentDescription = "Cow",
                modifier = Modifier
                    .width(150.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

            )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))


            Image(
                painter = painterResource(id = R.drawable.bi),
                contentDescription = "Cow",
                modifier = Modifier
                    .width(150.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

            )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.width(45.dp))


        Column {



            Spacer(modifier = Modifier.height(100.dp))


            Image(
                painter = painterResource(id = R.drawable.bi),
                contentDescription = "Cow",
                modifier = Modifier
                    .width(150.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

            )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))


            Image(
                painter = painterResource(id = R.drawable.bi),
                contentDescription = "Cow",
                modifier = Modifier
                    .width(150.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

            )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(10.dp))


            Image(
                painter = painterResource(id = R.drawable.bi),
                contentDescription = "Cow",
                modifier = Modifier
                    .width(150.dp)
                    .padding(20.dp)
                    .clip(RoundedCornerShape(15.dp)) // property to make curved edges on picture

            )

            Spacer(modifier = Modifier.height(2.dp))

            Button(onClick = { navController.navigate(ROUTE_BUYING) },
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = CircleShape,
                modifier = Modifier
                    .width(150.dp)
                    .padding(10.dp)
            ){
                Text(text = "BUY", fontSize = 20.sp, color = Color.White)
            }
        }

    }
//        Spacer(modifier = Modifier.height(30.dp))
//
//        Image(painter = painterResource(id = R.drawable.acc1),
//            contentDescription = "glasses",
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(2.dp))
//
//        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
//            colors = ButtonDefaults.buttonColors(Color.Black),
//            shape = CircleShape,
//            modifier = Modifier
//                .width(120.dp)
//                .padding(10.dp)
//        ){
//            Text(text = "BUY", fontSize = 20.sp, color = Color.White)
//        }

    }

//}

// This code is optional- used for preview
@Preview(showBackground = true)
@Composable
fun ProductPreview() {
    ProductScreen(rememberNavController()) // Have to call the Home function(the function above if i want to see preview)
}