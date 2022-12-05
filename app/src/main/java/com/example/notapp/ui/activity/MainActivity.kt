package com.example.notapp.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.notapp.R
import com.example.notapp.ui.utils.PreferenceHelper

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        navController = navHostFragment.navController

        if (PreferenceHelper.isSignUp && PreferenceHelper.isOnBoardShown) {
            navController.navigate(R.id.homeFragment)
        } else if (PreferenceHelper.isOnBoardShown && !PreferenceHelper.isSignUp) {
            navController.navigate(R.id.signUpFragment)
        } else {
            navController.navigate(R.id.onBoardFragment)
        }
    }
}
