package com.nate.mvvmlogin_nate.ui.theme.screens.home

// each screen should have a composable function


import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
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
import com.nate.mvvmlogin_nate.navigation.ROUTE_CALCULATOR
import com.nate.mvvmlogin_nate.navigation.ROUTE_INTENT
import com.nate.mvvmlogin_nate.navigation.ROUTE_LOGIN


//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            HomeScreen(rememberNavController())  // Have to call this function here in main activity otherwise app won't work
//        }
//    }
//}



@Composable
fun HomeScreen(navController: NavHostController){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Spacer(modifier = Modifier.height(30.dp))   // This is a spacer that gives some room height wise

        Text(text = "Welcome to Android Programming",
            color = Color.White,
            fontFamily = FontFamily.Cursive,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Nate's Mobile App",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(5.dp))

        Image(painter = painterResource(id = R.drawable.kyle),
            contentDescription = "Cow",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .clip(RoundedCornerShape(150.dp)) // property to make curved edges on picture
        )

//        Spacer(modifier = Modifier.height(30.dp))
//
//        Image(painter = painterResource(id = R.drawable.acc1),
//            contentDescription = "glasses",
//            modifier = Modifier.fillMaxWidth()
//        )
        Spacer(modifier = Modifier.height(0.dp))

        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
        ){
            Text(text = "Login", fontSize = 20.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate(ROUTE_CALCULATOR) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
        ){
            Text(text = "Calculator", fontSize = 20.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate(ROUTE_INTENT) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
        ){
            Text(text = "Intent", fontSize = 20.sp, color = Color.White)
        }

    }

}


// This code is optional- used for preview
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen(rememberNavController()) // Have to call the Home function(the function above if i want to see preview)
}