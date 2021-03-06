package com.example.recipeappstudyapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeappstudyapp.network.model.RecipeService
import com.google.gson.GsonBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val service = Retrofit.Builder()
			.baseUrl("https://food2fork.ca/api/recipe/")
			.addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
			.build()
			.create(RecipeService::class.java)
		CoroutineScope(IO).launch {
			val recipe = service.get(
				token = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48",
				id = 583
			)
			Log.d("MainActivity", "RecipeApp -> onCreate: ${recipe.title}")
		}
		Log.d("MainActivity", "onCreate teste.")
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.d("MainActivity", "onDestroy")
	}
}
