package com.example.nanlabmda.fragment_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragmrnt = supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navController = navHostFragmrnt.navController
    }
}