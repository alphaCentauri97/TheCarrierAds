package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.databinding.ActivityFilterBinding;

public class FilterActivity extends AppCompatActivity {

    ActivityFilterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFilterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btFullTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FilterActivity.this,ChatUiActivity.class);
                startActivity(intent);
            }
        });
        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}