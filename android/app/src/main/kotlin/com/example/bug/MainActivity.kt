package com.example.bug

import android.content.Intent
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel

class MainActivity: FlutterActivity() {

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        val methodChannel = MethodChannel(flutterEngine.dartExecutor.binaryMessenger, "bug/show_transparent")
        methodChannel.setMethodCallHandler { call, result ->
            showTransparentOverlay()
            result.success(null)
        }
    }

    private fun showTransparentOverlay() {
        val intent = Intent(this, TransparentOverlayActivity::class.java)
        startActivity(intent)
    }
}
