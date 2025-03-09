package com.example.tugas2_23411014



import android.R

import android.os.Bundle
import android.view.LayoutInflater

import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent

import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Scaffold

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

import com.example.tugas2_23411014.ui.theme.TUGAS2_23411014Theme



class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            TUGAS2_23411014Theme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Greeting(

                        name = "Diah",

                        modifier = Modifier.padding(innerPadding)

                    )

                }

            }

        }



    }

}



@Composable

fun Greeting(name: String, modifier: Modifier = Modifier) {

    Text(

        text = "Welcome $name",

        modifier = modifier

    )

}



@Preview(showBackground = true)

@Composable

fun GreetingPreview() {

    TUGAS2_23411014Theme {

        Greeting("DIAH")

    }
}