package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.Adapters.RecommendedJobsAdapter;
import com.example.hiringmeaaratech.Models.ModelRecommendedJobs;
import com.example.hiringmeaaratech.databinding.ActivityAppliedJobsBinding;

import java.util.ArrayList;
import java.util.List;

public class AppliedJobsActivity extends AppCompatActivity {

    ActivityAppliedJobsBinding binding;
    RecommendedJobsAdapter recommendedJobsAdapter;
    List<ModelRecommendedJobs> recommendedJobsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppliedJobsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerViewAppliedJobs.setLayoutManager(new LinearLayoutManager(this));
        recommendedJobsList = new ArrayList<>();

        recommendedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Aara technology",
                "Android Developer","Full Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "Delhi"));
        recommendedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Edu Gorrila",
                "Software Developer","Full Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "Lucknow"));

        recommendedJobsAdapter = new RecommendedJobsAdapter(this,recommendedJobsList);
        binding.recyclerViewAppliedJobs.setAdapter(recommendedJobsAdapter);

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}