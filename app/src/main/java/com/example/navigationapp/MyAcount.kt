package com.example.navigationapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AccountTest(controler: NavController){
    val previous = controler.previousBackStackEntry?.destination?.route

    Column() {
        Text(text = "Hellow Teste Acount como File")
        Text(text = "A tela que navegou para cá foi: $previous")

        Button(onClick = {
            controler.navigate("myAcount")
        }) {
            Text(text = "Navegar para outra tela Compose")
        }
    }

}
