package com.example.hiringmeaaratech.JobEmployer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.databinding.ActivityEditEmployerProfileBinding;
import com.example.hiringmeaaratech.databinding.ActivityEmployerProfileBinding;

public class EditEmployerProfileActivity extends AppCompatActivity {

    ActivityEditEmployerProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditEmployerProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}