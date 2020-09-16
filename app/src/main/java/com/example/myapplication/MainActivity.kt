package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


/**
 *
 * Hello World
 * Preview
 * Layout
 * state
 * Modifier
 * androidView
 * Ambients
 *
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorld()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HelloWorld() {

    val counterState = remember { mutableStateOf(0) }

    Column(modifier = Modifier.background(Color.Red).fillMaxSize()) {

        Text("You have clicked this button ${counterState.value} times", Modifier.gravity(Alignment.CenterHorizontally))
        Button(modifier = Modifier.padding(start = 24.dp), onClick = { counterState.value++ }) {
            Text("Klick mich")
        }
    }

}