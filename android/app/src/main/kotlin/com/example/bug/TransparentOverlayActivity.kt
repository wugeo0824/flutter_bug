package com.example.bug

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.bug.R

class TransparentOverlayActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transparent_overlay)
        val btnClickHere: Button = findViewById(R.id.btnClickHere)
        btnClickHere.setOnClickListener {
            showTopOpaqueActivity()
        }
    }

    private fun showTopOpaqueActivity() {
        val intent = Intent(this, TopOpaqueActivity::class.java)
        startActivity(intent)
    }
}