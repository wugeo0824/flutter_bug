package com.example.bug

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import com.example.bug.R

class TopOpaqueActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_opaque)
        val btnGoBack: Button = findViewById(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            finish()
        }
    }
}