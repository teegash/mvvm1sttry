package com.nate.mvvmlogin_nate.ui.theme.screens.bottomnavbar
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.ShoppingCart
//import androidx.compose.material3.BottomAppBar
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.FloatingActionButton
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import com.nate.mvvmlogin_nate.navigation.ROUTE_PRODUCTS
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun BottomnavScreen () {
//
////    val screens = listOf("Home", "Calculator", "Intent", "Shop", "Login")
////    var selectedScreen by remember { mutableStateOf(screens.first())}
//
//    Scaffold(
//        bottomBar = {
//            BottomAppBar(
//                modifier = Modifier.clip(RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)),
//                containerColor = Color.LightGray
//            ) {
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceAround
//                ) {
//
//
//                    IconButton(onClick = {}) {
//                        Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shop")
//
//                    }
//                    FloatingActionButton(onClick = {}, containerColor = Color.Gray) {
//                        Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
//                    }
//                    IconButton(onClick = {}) {
//                        Icon(imageVector = Icons.Default.Menu, contentDescription = "Intent")
//
//                    }
//
//
//                }
//            }
//        }
//    )
//    {}
//}
//
//
////        content = {
////            Column(
////                modifier = Modifier.fillMaxSize(),
////                verticalArrangement = Arrangement.Center,
////                horizontalAlignment = Alignment.CenterHorizontally
////            ) {
////                Text(text = "Selected Screen: $selectedScreen")
////            }
////
////        }
//
//
//
//
//
//
//
////@Preview
////@Composable
////fun BottomNavPreview() {
////
////    BottomNavBarScreen()
////
////}