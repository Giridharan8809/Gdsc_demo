package com.example.gdscdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage

@Composable
fun LoginScreen(navController: NavHostController) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 30.dp)
    ){
        var email by remember{
            mutableStateOf("")
        }
        var password by remember{
            mutableStateOf("")
        }
        Spacer(Modifier.height(16.dp))
        Text(
            "Wallpaper Gallery",
            style = TextStyle(fontSize = 32.sp),
            fontFamily = FontFamily.Cursive,
            fontSize = 36.sp,
            fontWeight = FontWeight.ExtraBold
        )
        AsyncImage(
            model = "https://wallpapers.com/images/hd/wallpaper-chain-iron-metal-links-blur-1wkvbpapxb6wafjx.webp",
            contentDescription = "chain links image",
            modifier = Modifier.clip(shape = RoundedCornerShape(16.dp))
        )


        OutlinedTextField(
            value = email,
            label = { Text("Email") },
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation=PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(onClick = {
                    navController.navigate("GalleryScreen")
        }, modifier = Modifier.fillMaxWidth()) {
            Text("Submit")
        }
    }
}