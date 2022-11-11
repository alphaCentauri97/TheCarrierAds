package com.example.hiringmeaaratech.Fragments.EditProfileFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.Adapters.ExperienceAdapter;
import com.example.hiringmeaaratech.ExperienceActivity;
import com.example.hiringmeaaratech.Models.ModelExperience;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FragmentExperinceBinding;

import java.util.ArrayList;
import java.util.List;

public class ExperinceFragment extends Fragment {

    FragmentExperinceBinding binding;
    ExperienceAdapter experienceAdapter;
    List<ModelExperience> experienceList;
    public ExperinceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentExperinceBinding.inflate(inflater, container, false);
        binding.recyclerViewExperience.setLayoutManager(new LinearLayoutManager(getContext()));
        experienceList = new ArrayList<>();

        experienceList.add(new ModelExperience("OyeLab","20-08-2021"));
        experienceList.add(new ModelExperience("Paytm","20-08-2021"));
        experienceList.add(new ModelExperience("Google","20-08-2021"));
        experienceList.add(new ModelExperience("Microsoft","20-08-2021"));

        experienceAdapter = new ExperienceAdapter(getContext(),experienceList);
        binding.recyclerViewExperience.setAdapter(experienceAdapter);

        binding.tvExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ExperienceActivity.class);
                startActivity(intent);
            }
        });

        return binding.getRoot();
    }
}