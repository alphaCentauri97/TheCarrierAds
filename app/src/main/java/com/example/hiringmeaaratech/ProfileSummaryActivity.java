package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.databinding.ActivityEditProfileBinding;
import com.example.hiringmeaaratech.databinding.ActivityProfileSummaryBinding;

public class ProfileSummaryActivity extends AppCompatActivity {

    ActivityProfileSummaryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileSummaryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.btnAddSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileSummaryActivity.this, LanguageActivity.class);
                startActivity(intent);
            }
        });
    }
}