package com.nbgsoftware.gbrains.ui.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbgsoftware.gbrains.databinding.ActivityMainBinding

class ContainerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.textView.text = "This is branch Kotlin project"
    }
}