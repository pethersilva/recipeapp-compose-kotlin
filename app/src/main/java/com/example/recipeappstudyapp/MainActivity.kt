package com.example.recipeappstudyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
		setContent {
			Column(modifier = Modifier.padding(16.dp)) {
				Text(text = "Hello World Jetpack Compose")
				Spacer(modifier = Modifier.padding(top = 16.dp))
				Button(onClick = {}) {
					Text(text = "OK")
				}
			}
		}
    }
}
