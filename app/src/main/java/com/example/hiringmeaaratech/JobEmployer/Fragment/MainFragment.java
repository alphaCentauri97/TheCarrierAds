package com.example.hiringmeaaratech.JobEmployer.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.JobEmployer.Adapter.PostJobsAdapter;
import com.example.hiringmeaaratech.JobEmployer.CreateNewJobActivity;
import com.example.hiringmeaaratech.JobEmployer.ModelPostJobs;
import com.example.hiringmeaaratech.JobEmployer.PostedJobActivity;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    PostJobsAdapter postJobsAdapter;
    List<ModelPostJobs>postJobsList;
    FragmentMainBinding binding;
    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentMainBinding.inflate(inflater, container, false);
        postJobsList = new ArrayList<>();
        binding.recyclerViewPostedJobs.setLayoutManager(new LinearLayoutManager(getActivity()));
        postJobsList.add(new ModelPostJobs(R.drawable.user_logo,"Software Developer","Lucknow",
                "Work From Home","2 - 3(Years)"));
        postJobsList.add(new ModelPostJobs(R.drawable.user_logo,"Software Developer","Lucknow",
                "Work From Home","2 - 3(Years)"));
        postJobsAdapter = new PostJobsAdapter(getActivity(),postJobsList);
        binding.recyclerViewPostedJobs.setAdapter(postJobsAdapter);

        binding.tvViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PostedJobActivity.class);
                startActivity(intent);
            }
        });

        binding.btnNextJobPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CreateNewJobActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();


    }
}