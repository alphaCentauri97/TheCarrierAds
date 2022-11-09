package com.example.hiringmeaaratech.Fragments.BottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.Adapters.FilterAdapter;
import com.example.hiringmeaaratech.Adapters.JobTypeAdapter;
import com.example.hiringmeaaratech.Adapters.UserResultAdapter;
import com.example.hiringmeaaratech.FilterActivity;
import com.example.hiringmeaaratech.Models.ModelUserResult;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FragmentSearchBinding;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment {

    FragmentSearchBinding binding;
    UserResultAdapter userResultAdapter;
    FilterAdapter filterAdapter;
    JobTypeAdapter jobTypeAdapter;
    List<ModelUserResult> resultList;
    List<String> filterList;
    List<String> jobTypeList;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false);
        resultList = new ArrayList<>();
        filterList = new ArrayList<>();
        jobTypeList = new ArrayList<>();
        getFilterItems();
        getJobTypeItems();
        getuserResult();
        binding.filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FilterActivity.class);
                startActivity(intent);
            }
        });

        return binding.getRoot();
    }

    public void getuserResult() {
        binding.recyclerViewUserResult.setLayoutManager(new LinearLayoutManager(getContext()));
        resultList.add(new ModelUserResult
                (R.drawable.company_logo, "Oye Labs",
                        "Kharagpur", "Full time", "Fresher","12-15k"));
        resultList.add(new ModelUserResult
                (R.drawable.company_logo, "Paytm", "New Delhi", "Internship","Experienced","500-800k"));
        resultList.add(new ModelUserResult
                (R.drawable.company_logo, "Google", "Banglore", "Internship", "Fresher","100-500k"));
        resultList.add(new ModelUserResult
                (R.drawable.company_logo, "Microsoft", "Mumbai", "Full time", "Experienced","20-50k"));
        userResultAdapter = new UserResultAdapter(getContext(), resultList);
        binding.recyclerViewUserResult.setAdapter(userResultAdapter);

    }

    public void getFilterItems() {
        binding.recyclerViewFilter.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        filterList.add("Profile");
        filterList.add("Work Type");
        filterList.add("Duration");
        filterList.add("Location");
        filterAdapter = new FilterAdapter(getContext(),filterList);
        binding.recyclerViewFilter.setAdapter(filterAdapter);
    }
    public void getJobTypeItems() {
        binding.recyclerViewJobType.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));
        jobTypeList.add("UI/UX");
        jobTypeList.add("e.g full-time");
        jobTypeList.add("Internship");
        jobTypeList.add("e.g full-time");
        jobTypeAdapter = new JobTypeAdapter(getContext(),jobTypeList);
        binding.recyclerViewJobType.setAdapter(jobTypeAdapter);
    }
}