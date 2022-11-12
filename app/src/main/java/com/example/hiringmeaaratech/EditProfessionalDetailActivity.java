package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.databinding.ActivityEditProfessionalDetailBinding;

public class EditProfessionalDetailActivity extends AppCompatActivity {

    ActivityEditProfessionalDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditProfessionalDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}