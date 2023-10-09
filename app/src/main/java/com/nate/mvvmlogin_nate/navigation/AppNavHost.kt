package com.nate.mvvmlogin_nate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.ui.theme.screens.buy.BuyingScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.calc.CalculatorScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.home.HomeScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.intent.IntentScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.login.LoginScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.products.ProductScreen
import com.nate.mvvmlogin_nate.ui.theme.screens.register.RegisterScreen

// create a composable function/ write comp then tab/ then write the long code

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_HOME) {

        NavHost(navController = navController,
            modifier = modifier,
            startDestination = startDestination ){

            composable(ROUTE_HOME){
                HomeScreen(navController)
            }
            composable(ROUTE_LOGIN){
                LoginScreen(navController)
            }
            composable(ROUTE_REGISTER){
                RegisterScreen(navController)
            }
            composable(ROUTE_PRODUCTS){
                ProductScreen(navController)
            }
            composable(ROUTE_BUYING){
                BuyingScreen(navController)
            }
            composable(ROUTE_CALCULATOR){
                CalculatorScreen(navController)
            }
            composable(ROUTE_INTENT){
                IntentScreen(navController)
            }

        }

}