package com.example.recipeappstudyapp.network.model.responses

import com.example.recipeappstudyapp.network.model.RecipeNetworkEntity
import com.google.gson.annotations.SerializedName

class RecipeSearchResponse(
	@SerializedName("count")
	var count: Int,

	@SerializedName("results")
	var recipes: List<RecipeNetworkEntity>
)
