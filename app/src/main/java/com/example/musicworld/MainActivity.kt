package com.example.musicworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.`music-world`.R

class MainActivity : AppCompatActivity() {

    private lateinit var binding: AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}