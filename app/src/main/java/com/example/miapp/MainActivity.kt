package com.example.miapp

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val texto = TextView(this)
        texto.text = "¡Hola! Mi primera app funciona 🎉"
        texto.textSize = 24f
        texto.gravity = Gravity.CENTER
        setContentView(texto)
    }
}
