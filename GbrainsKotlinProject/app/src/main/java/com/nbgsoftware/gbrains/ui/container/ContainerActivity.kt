package com.nbgsoftware.gbrains.ui.container

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nbgsoftware.gbrains.databinding.ActivityContainerBinding

class ContainerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
    }
}