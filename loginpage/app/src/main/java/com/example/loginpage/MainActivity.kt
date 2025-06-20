package com.example.loginpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginapp.navigation.AppNavigation
import com.example.loginapp.ui.theme.LoginAppTheme
import com.example.loginpage.R
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAppTheme {
                AppNavigation()
            }
        }
    }
}
