package com.gulshan.locationalarm.feature_create_or_edit_alarm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.gulshan.locationalarm.ui.theme.LocationAlarmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LocationAlarmTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeScreen("Android")
                }
            }
        }
    }
}

@Composable
fun HomeScreen(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun MapView(){

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LocationAlarmTheme {
        HomeScreen("Android")
    }
}