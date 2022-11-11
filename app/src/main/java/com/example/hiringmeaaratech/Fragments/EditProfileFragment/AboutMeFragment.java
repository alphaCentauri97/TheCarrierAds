package com.example.hiringmeaaratech.Fragments.EditProfileFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.LanguageActivity;
import com.example.hiringmeaaratech.PersonalDetailActivity;
import com.example.hiringmeaaratech.PersonalProjectActivity;
import com.example.hiringmeaaratech.ProfileActivity;
import com.example.hiringmeaaratech.ProfileSummaryActivity;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.SkillActivity;
import com.example.hiringmeaaratech.databinding.FragmentAboutMeBinding;


public class AboutMeFragment extends Fragment {


    FragmentAboutMeBinding binding;

    public AboutMeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentAboutMeBinding.inflate(inflater, container, false);
        binding.btnPersonalDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PersonalDetailActivity.class);
                startActivity(intent);
            }
        });

        binding.btnAddSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SkillActivity.class);
                startActivity(intent);
            }
        });
        binding.btnProjectSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PersonalProjectActivity.class);
                startActivity(intent);
            }
        });

        binding.btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), LanguageActivity.class);
                startActivity(intent);
            }
        });

        binding.btnProfileSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), ProfileSummaryActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}