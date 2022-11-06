package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.databinding.ActivityCompanyProfilePageBinding;
import com.example.hiringmeaaratech.databinding.ActivityFilterBinding;

public class CompanyProfilePage extends AppCompatActivity {

    ActivityCompanyProfilePageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCompanyProfilePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompanyProfilePage.this,ProfileActivity.class);
                startActivity(intent);
            }
        });    }
}