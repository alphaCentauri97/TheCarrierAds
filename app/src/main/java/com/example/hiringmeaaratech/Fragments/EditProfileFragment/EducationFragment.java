package com.example.hiringmeaaratech.Fragments.EditProfileFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.Adapters.EducationAdapter;
import com.example.hiringmeaaratech.CertificationActivity;
import com.example.hiringmeaaratech.EducationDetailActivity;
import com.example.hiringmeaaratech.Models.ModelEducation;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FragmentEducationBinding;

import java.util.ArrayList;
import java.util.List;

public class EducationFragment extends Fragment {

    FragmentEducationBinding binding;
    EducationAdapter educationAdapter;
    List<ModelEducation> educationList;
    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        educationList = new ArrayList<>();
        binding =  FragmentEducationBinding.inflate(inflater, container, false);
        binding.recycleViewEducation.setLayoutManager(new LinearLayoutManager(getContext()));
        educationList.add(new ModelEducation("IIT Bombay","B.tech","2019"));
        educationList.add(new ModelEducation("Woodward Public School","High School","2015"));
        educationList.add(new ModelEducation("BBD University","B.tech","2020"));
        educationAdapter = new EducationAdapter(getContext(),educationList);
        binding.recycleViewEducation.setAdapter(educationAdapter);

        binding.tveducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), EducationDetailActivity.class);
                startActivity(intent);
            }
        });

        binding.tvCertification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CertificationActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}