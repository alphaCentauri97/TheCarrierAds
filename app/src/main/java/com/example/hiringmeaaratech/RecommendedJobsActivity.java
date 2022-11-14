package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.Adapters.RecommendedJobsAdapter;
import com.example.hiringmeaaratech.Models.ModelRecommendedJobs;
import com.example.hiringmeaaratech.databinding.ActivityRecommendedJobsBinding;

import java.util.ArrayList;
import java.util.List;

public class RecommendedJobsActivity extends AppCompatActivity {

    ActivityRecommendedJobsBinding binding;
    RecommendedJobsAdapter recommendedJobsAdapter;
    List<ModelRecommendedJobs> recommendedJobsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecommendedJobsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerViewRecommended.setLayoutManager(new LinearLayoutManager(this));
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
        recommendedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Paytm",
                "Python Developer","Part Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "Noida"));
        recommendedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Google",
                "Java Developer","Full Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "New York"));

        recommendedJobsAdapter = new RecommendedJobsAdapter(this,recommendedJobsList);
        binding.recyclerViewRecommended.setAdapter(recommendedJobsAdapter);

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}