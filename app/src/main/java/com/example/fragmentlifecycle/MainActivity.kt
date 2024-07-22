package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openFragment = findViewById<Button>(R.id.button)
        openFragment.setOnClickListener {
            val fragment = FragmentLifecycle()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, fragment)

                addToBackStack(null)
                commit()
            }

        }

        Log.d("TAGGG", "Activity onCreate: Called...")
        Toast.makeText(this, "Activity onCreate: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAGGG", "Activity onStart: Called...")
        Toast.makeText(this, "Activity onStart: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAGGG", "Activity onResume: Called...")
        Toast.makeText(this, "Activity onResume: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAGGG", "Activity onPause: Called...")
        Toast.makeText(this, "Activity onPause: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAGGG", "Activity onRestart: Called...")
        Toast.makeText(this, "Activity onRestart: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAGGG", "Activity onStop: Called...")
        Toast.makeText(this, "Activity onStop: Called...", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAGGG", "Activity onDestroy: Called...")
        Toast.makeText(this, "Activity onDestroy: Called...", Toast.LENGTH_SHORT).show()
    }
}