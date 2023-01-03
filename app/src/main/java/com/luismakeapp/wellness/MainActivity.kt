package com.luismakeapp.wellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luismakeapp.wellness.ui.theme.WellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DayCard()
                }
            }
        }
    }
}


@Composable
fun WellnessApp(){
    Scaffold(
        topBar =
    ) {

    }
}

@Composable
fun TopBar(){
    Row(
        horizontalArrangement = Arrangement.Center
    ) {
        
    }
}

@Composable
fun DayCard() {
    Card(elevation = 3.dp, shape = MaterialTheme.shapes.small) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Title1", fontWeight = FontWeight.Bold)
            Image(painter = painterResource(id = R.drawable.image1) , contentDescription = null)
            Text(text = "Description1", style = MaterialTheme.typography.body1)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WellnessTheme {
        DayCard()
    }
}