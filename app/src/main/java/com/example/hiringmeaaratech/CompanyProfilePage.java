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



        binding.leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


//        int imgCompany = Integer.parseInt(getIntent().getStringExtra("imgCompany"));
        String company = getIntent().getStringExtra("companyName");
        String location = getIntent().getStringExtra("location");
        String jobtype = getIntent().getStringExtra("jobType");
        String description = getIntent().getStringExtra("description");
        String technology = getIntent().getStringExtra("technology");


        binding.tvCompanyName.setText(company);
        binding.tvlocation.setText(location);
        binding.tvJobType.setText(jobtype);
        binding.tvDescription.setText(description);
        binding.tvTechnology.setText(technology);
//        binding.imgCompanyLogo.setImageResource(imgCompany);



    }
}