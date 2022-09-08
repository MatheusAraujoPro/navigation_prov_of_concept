package com.example.navigationapp

import android.view.View
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.findNavController

@Composable
fun ProfileTest(newController: NavController, oldController: NavController) {
    Column() {
        Text(text = "Hellow Teste Profile como File")

        Button(
            onClick = {
                newController.navigate("myAcount")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Navegar para a tela de Acount")
        }

        Button(
            onClick = {
                val action =
                    ScreanFragmentComposeTestDirections.actionScreanFragmentComposeTestToHomeFragment()
                oldController.navigate(action)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Navegar de volta para o início")
        }
    }
}
