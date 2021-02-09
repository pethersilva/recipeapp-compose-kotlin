package com.example.recipeappstudyapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ContextAmbient
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.viewinterop.viewModel
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
							  savedInstanceState: Bundle?): View {

		//old way without use Compose - Begin
		/*val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
		return view*/
		//old way without use Compose - End

		//Using ComposeView - Begin
		//val view = ComposeView(requireContext())
		//view.apply {
		//	setContent {
		//		Text(text = "Hey, this is a composed view")
		//	}
		//}
		//return view
		//Using ComposeView - End

		//Using ComposeView to include a Customized view - Begin
		val view = inflater.inflate(R.layout.fragment_recipe_list, container, false)
		view.findViewById<ComposeView>(R.id.compose_view).setContent {
			Column(modifier = Modifier
					.border(border = BorderStroke(2.dp, Color.Blue))
					.padding(16.dp)
			) {
				Text(text = "This is a composable inside the fragment")
				Spacer(modifier = Modifier.padding(10.dp))
				CircularProgressIndicator()
				Spacer(modifier = Modifier.padding(10.dp))
				Text(text = "Just a text")
				val customView = HorizontalDottedProgress(AmbientContext.current)
				AndroidView(viewBlock = {customView})
			}
		}
		return view
		//Using ComposeView to include a Customized view - End
	}
}
