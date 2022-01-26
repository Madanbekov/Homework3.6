package com.example.homework36;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework36.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, new SecondFragment()).commit();
    }
}