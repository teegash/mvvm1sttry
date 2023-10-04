package com.nate.mvvmlogin_nate.ui.theme.screens.home

// each screen should have a composable function


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.R
import com.nate.mvvmlogin_nate.navigation.ROUTE_LOGIN
import com.nate.mvvmlogin_nate.ui.theme.MvvmloginnateTheme
import com.nate.mvvmlogin_nate.ui.theme.screens.login.LoginScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.register.RegisterScreen

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

        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Nate's Mobile App",
            color = Color.White,
            fontFamily = FontFamily.Serif,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Image(painter = painterResource(id = R.drawable.bi),
            contentDescription = "Cow",
            modifier = Modifier.fillMaxWidth()
        )

//        Spacer(modifier = Modifier.height(30.dp))
//
//        Image(painter = painterResource(id = R.drawable.acc1),
//            contentDescription = "glasses",
//            modifier = Modifier.fillMaxWidth()
//        )
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
        ){
            Text(text = "Login", fontSize = 20.sp, color = Color.White)
        }

    }

}

// This code is optional- used for preview
@Preview(showBackground = true)
@Composable
fun HomePreview() {
    HomeScreen(rememberNavController()) // Have to call the Home function(the function above if i want to see preview)
}