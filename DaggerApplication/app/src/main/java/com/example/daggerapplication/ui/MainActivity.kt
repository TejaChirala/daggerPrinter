package com.example.daggerapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerapplication.R
import com.example.daggerapplication.model.Printer
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
