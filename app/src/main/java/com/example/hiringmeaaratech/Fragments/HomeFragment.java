package com.example.hiringmeaaratech.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.hiringmeaaratech.Adapters.RecommendedJobsAdapter;
import com.example.hiringmeaaratech.Adapters.TypesOfJobAdapter;
import com.example.hiringmeaaratech.AppliedJobsActivity;
import com.example.hiringmeaaratech.EditProfileActivity;
import com.example.hiringmeaaratech.Models.ModelRecommendedJobs;
import com.example.hiringmeaaratech.Models.ModelTypesOfJob;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.RecommendedJobsActivity;
import com.example.hiringmeaaratech.SavedJobsActivity;
import com.example.hiringmeaaratech.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    List<ModelRecommendedJobs>recommendedJobsList;
    List<ModelRecommendedJobs>appliedJobsList;
    RecommendedJobsAdapter recommendedJobsAdapter;
    TypesOfJobAdapter typesOfJobAdapter;
    List<ModelTypesOfJob> typesOfJobList;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding =  FragmentHomeBinding.inflate(inflater, container, false);

        getTypesofJob();
        getJobRecommendation();
        getSpinnerItems();
        getAppliedJobs();

        binding.llJobsNearMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RecommendedJobsActivity.class);
                startActivity(intent);
            }
        });
        binding.appliedJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AppliedJobsActivity.class);
                startActivity(intent);
            }
        });

        binding.tvViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RecommendedJobsActivity.class);
                startActivity(intent);
            }
        });

        binding.savedJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SavedJobsActivity.class);
                startActivity(intent);
            }
        });

        binding.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
            }
        });
        binding.tvAppliedViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AppliedJobsActivity.class);
                startActivity(intent);
            }
        });

        return binding.getRoot();
    }

    private void getSpinnerItems() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),R.array.spinner_typesOf_job,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerTypesofJob.setAdapter(adapter);
        binding.spinnerTypesofJob.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void getTypesofJob(){

        binding.recycleViewTypesOfJob.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL,false));
        typesOfJobList = new ArrayList<>();
        typesOfJobList.add(new ModelTypesOfJob("Bihar Bpsc Head Master Exam 2022 Online Form",
                "06/11/2022",
                "07/11/2022",
                "11/11/2022",
                "Headmaster in Senior Secondary Schools under Education Department, Govt. of Bihar...."));
        typesOfJobList.add(new ModelTypesOfJob("Android Developer",
                "06/11/2022",
                "07/11/2022",
                "11/11/2022",
                "Headmaster in Senior Secondary Schools under Education Department, Govt. of Bihar...."));
        typesOfJobList.add(new ModelTypesOfJob("Bihar Bpsc Head Master Exam 2022 Online Form",
                "06/11/2022",
                "07/11/2022",
                "11/11/2022",
                "Headmaster in Senior Secondary Schools under Education Department, Govt. of Bihar...."));
        typesOfJobList.add(new ModelTypesOfJob("Android Developer",
                "06/11/2022",
                "07/11/2022",
                "11/11/2022",
                "Headmaster in Senior Secondary Schools under Education Department, Govt. of Bihar...."));

        typesOfJobAdapter = new TypesOfJobAdapter(getActivity(),typesOfJobList);
        binding.recycleViewTypesOfJob.setAdapter(typesOfJobAdapter);

    }
    private void getJobRecommendation(){
        binding.recyclerViewRecommended.setLayoutManager(new LinearLayoutManager(getActivity()));
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
                "Indira Nagar Near Shekhar hospital, Lucknow"));
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

        recommendedJobsAdapter = new RecommendedJobsAdapter(getActivity(),recommendedJobsList);
        binding.recyclerViewRecommended.setAdapter(recommendedJobsAdapter);

    }

    private void getAppliedJobs(){
        binding.recyclerViewAppliedJobs.setLayoutManager(new LinearLayoutManager(getActivity()));
        appliedJobsList = new ArrayList<>();

        appliedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Aara technology",
                "Android Developer","Full Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "Delhi"));
        appliedJobsList.add(new ModelRecommendedJobs(
                R.drawable.user_full_logo,"Edu Gorrila",
                "Software Developer","Full Time",
                "This is php job for all file candidature must have good knowledge have framework",
                "Lucknow"));

        if(!appliedJobsList.isEmpty()){
            binding.tvapplidJobs.setVisibility(View.VISIBLE);
            binding.tvAppliedViewAll.setVisibility(View.VISIBLE);
            recommendedJobsAdapter = new RecommendedJobsAdapter(getActivity(),appliedJobsList);
            binding.recyclerViewAppliedJobs.setAdapter(recommendedJobsAdapter);
        }
        else {
            binding.tvapplidJobs.setVisibility(View.GONE);
            binding.tvAppliedViewAll.setVisibility(View.GONE);
        }

    }

}