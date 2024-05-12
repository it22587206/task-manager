package com.coding.meet.todo_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashscreen : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH: Long = 2000 // Splash screen duration in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        // Handler to start the main activity after the splash screen duration
        Handler().postDelayed({
            // Start the main activity
            val mainIntent = Intent(this@splashscreen, MainActivity::class.java)
            startActivity(mainIntent)
            finish() // Close the splash screen activity
        }, SPLASH_DISPLAY_LENGTH)
    }
}
