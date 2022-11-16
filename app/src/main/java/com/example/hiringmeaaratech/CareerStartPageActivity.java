package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.JobEmployer.HomeActivity;
import com.example.hiringmeaaratech.databinding.ActivityCareerStartPageBinding;

import java.util.ArrayList;
import java.util.List;

public class CareerStartPageActivity extends AppCompatActivity {

    ActivityCareerStartPageBinding binding;
    CompanyAdapter companyAdapter;
    List<Integer>companyList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCareerStartPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        companyList = new ArrayList<>();
        binding.recycleViewCompanies.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false));
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyList.add(R.drawable.companies_img);
        companyAdapter = new CompanyAdapter(this,companyList);
        binding.recycleViewCompanies.setAdapter(companyAdapter);

        binding.iWantJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareerStartPageActivity.this , SeekingJobActivity.class);
                intent.putExtra("num",1);
                startActivity(intent);
                finish();
            }
        });
        binding.iWantHire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CareerStartPageActivity.this , HomeActivity.class);
                intent.putExtra("num",2);
                startActivity(intent);
                finish();
            }
        });


    }
}