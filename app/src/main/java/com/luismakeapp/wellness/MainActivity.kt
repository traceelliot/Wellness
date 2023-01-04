package com.luismakeapp.wellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.luismakeapp.wellness.model.Day
import com.luismakeapp.wellness.model.Mounth.mounth
import com.luismakeapp.wellness.ui.theme.WellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                ) {
                    WellnessApp()
                }
            }
        }
    }
}


@Composable
fun WellnessApp(){
    Scaffold(
        topBar = {TopBar()}
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(MaterialTheme.colors.secondary)
                .fillMaxWidth()
        ){
            items(mounth){ day ->
                DayCard(day)
            }
        }
    }
}

@Composable
fun TopBar(){
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.primary)
    ) {
        Text(text = "Wellness", style = MaterialTheme.typography.h1)
    }
}

@Composable
fun DayCard(day: Day) {
    Card(
        elevation = 3.dp,
        shape = MaterialTheme.shapes.small,
        modifier = Modifier.padding(8.dp)
    ) {
        Column() {
            Text(
                text = day.title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 8.dp),
                style = MaterialTheme.typography.h3
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = day.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.padding(8.dp)
                )
                Text(text = day.description, style = MaterialTheme.typography.body1, modifier = Modifier.padding(5.dp))
            }
        }

    }
}

@Preview()
@Composable
fun DefaultPreview() {
    WellnessTheme {
        WellnessApp()
    }
}