package com.nate.mvvmlogin_nate.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
import androidx.compose.animation.animateContentSize
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.nate.mvvmlogin_nate.R
import com.nate.mvvmlogin_nate.navigation.ROUTE_CALCULATOR
import com.nate.mvvmlogin_nate.navigation.ROUTE_INTENT
import com.nate.mvvmlogin_nate.navigation.ROUTE_LOGIN

@Composable
fun IntentScreen(navController: NavHostController) {

    val context= LocalContext.current // added to import the context

    // Create the following buttons: camera, sms, dial, mpesa, email, share, call

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {
        Spacer(modifier = Modifier.height(30.dp))   // This is a spacer that gives some room height wise

        Text(text = "Intent Page",
            color = Color.White,
            fontFamily = FontFamily.Cursive,
            fontSize = 25.sp
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            val uri = Uri.parse("smsto:254707694388")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello! How are you?")
            context.startActivity(intent)
        }, colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(140.dp)
                .padding(10.dp)) {
            Text(text = "SMS", fontSize = 20.sp, color = Color.White)
        }

        // The below code was the original but didn't work. Solved the bug using ai.
//        Button(onClick = {
//            val uri = Uri.parse("sms to:254707694388")
//
//            val intent = Intent(Intent.ACTION_SENDTO, uri)
//
//            intent.putExtra("Hello", "How you doing?")
//
//            context.startActivity(intent)
//        },
//            colors = ButtonDefaults.buttonColors(Color.Black),
//            shape = CircleShape,
//            modifier = Modifier
//                .width(140.dp)
//                .padding(10.dp)
//        ){
//            Text(text = "SMS", fontSize = 20.sp, color = Color.White)
//        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254707694388"))

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(160.dp)
                .padding(10.dp)
        ){
            Text(text = "Call", fontSize = 20.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val phone = "+254707694388"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(180.dp)
                .padding(10.dp)
        ){
            Text(text = "Dial", fontSize = 20.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "nategadgets@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "RE:")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            context.startActivity(Intent.createChooser(emailIntent, "Send email..."))
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(200.dp)
                .padding(10.dp)
        ){
            Text(text = "Email", fontSize = 21.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(220.dp)
                .padding(10.dp)
        ){
            Text(text = "Share", fontSize = 22.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val simToolKitLaunchIntent =
            context.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(240.dp)
                .padding(10.dp)
        ){
            Text(text = "MPESA", fontSize = 23.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(260.dp)
                .padding(10.dp)
        ){
            Text(text = "Camera", fontSize = 25.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(5.dp))

        Button(onClick = { navController.navigate(ROUTE_CALCULATOR)
        },
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = CircleShape,
            modifier = Modifier
                .width(300.dp)
                .padding(10.dp)
        ){
            Text(text = "Calculator", fontSize = 26.sp, color = Color.White)
        }

    }


    
}

@Preview
@Composable
fun Intentpreview() {

    IntentScreen(rememberNavController())
    
}