package com.cristal.niaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launchDeviceSettings()
    }

    private fun launchDeviceSettings() {
        val intent = Intent(android.provider.Settings.ACTION_SETTINGS)
        startActivity(intent)
    }
}