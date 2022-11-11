package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.hiringmeaaratech.Adapters.EducationAdapter;
import com.example.hiringmeaaratech.Adapters.ExperienceAdapter;
import com.example.hiringmeaaratech.Models.ModelEducation;
import com.example.hiringmeaaratech.Models.ModelExperience;
import com.example.hiringmeaaratech.databinding.ActivityEducationDetailBinding;
import com.example.hiringmeaaratech.databinding.DialogLevelOfEducationBinding;
import com.example.hiringmeaaratech.databinding.FragmentEducationBinding;
import com.example.hiringmeaaratech.databinding.FragmentExperinceBinding;

import java.util.ArrayList;
import java.util.List;

public class EducationDetailActivity extends AppCompatActivity {

    ActivityEducationDetailBinding binding;
    List<ModelEducation> educationList;
    EducationAdapter educationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEducationDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        educationList = new ArrayList<>();
        binding.recycleViewEducation.setLayoutManager(new LinearLayoutManager(this));
        educationList.add(new ModelEducation("IIT Bombay","B.tech","2019"));
        educationList.add(new ModelEducation("Woodward Public School","High School","2015"));
        educationList.add(new ModelEducation("BBD University","B.tech","2020"));
        educationAdapter = new EducationAdapter(this,educationList);
        binding.recycleViewEducation.setAdapter(educationAdapter);

        binding.btnLevelEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(EducationDetailActivity.this);
                DialogLevelOfEducationBinding binding;
                binding = DialogLevelOfEducationBinding.inflate(getLayoutInflater());
                dialog.setContentView(binding.getRoot());
                dialog.show();
                Window window = dialog.getWindow();
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);

                binding.btnSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }
}