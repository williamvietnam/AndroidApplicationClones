package com.nbgsoftware.gbrains;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nbgsoftware.gbrains.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.textView.setText("This is branch dev debug with java programing");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}