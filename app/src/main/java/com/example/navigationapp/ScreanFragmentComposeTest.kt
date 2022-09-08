package com.example.navigationapp

import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextDirection.Companion.Content
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.databinding.FragmentScreanComposeBinding

class ScreanFragmentComposeTest : BaseFragment(){

    @Composable
    override fun Screan() {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = "profile"

        ) {
            composable("profile") { ProfileTest(navController, defaultNavController) }
            composable("myAcount") { AccountTest(navController) }
            composable("myFinances") { }
        }
    }
}

