package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hiringmeaaratech.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {

    ActivitySearchBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}