package com.example.rolldice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var textView : TextView
    private val range = 1..6


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        textView.text = "00"
        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        button.setOnClickListener{
            textView.text = Random.nextInt(range.first, range.last+1).toString()
            textView.startAnimation(animation)
        }
    }
}