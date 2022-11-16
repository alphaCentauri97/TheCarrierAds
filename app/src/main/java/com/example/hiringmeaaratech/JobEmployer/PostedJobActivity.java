package com.example.hiringmeaaratech.JobEmployer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.JobEmployer.Adapter.PostJobsAdapter;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.ActivityPostedJobBinding;

import java.util.ArrayList;
import java.util.List;

public class PostedJobActivity extends AppCompatActivity {

    ActivityPostedJobBinding binding;
    List<ModelPostJobs>postJobsList;
    PostJobsAdapter postJobsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostedJobBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        postJobsList = new ArrayList<>();
        binding.recyclerViewPostedJobs.setLayoutManager(new LinearLayoutManager(this));
        postJobsList.add(new ModelPostJobs(R.drawable.user_logo,"Software Developer","Lucknow",
                "Work From Home","2 - 3(Years)"));
        postJobsList.add(new ModelPostJobs(R.drawable.user_logo,"Software Developer","Lucknow",
                "Work From Home","2 - 3(Years)"));
        postJobsAdapter = new PostJobsAdapter(this,postJobsList);
        binding.recyclerViewPostedJobs.setAdapter(postJobsAdapter);

    }
}