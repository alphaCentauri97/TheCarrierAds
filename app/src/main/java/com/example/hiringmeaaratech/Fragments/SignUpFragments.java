package com.example.hiringmeaaratech.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.FilterActivity;
import com.example.hiringmeaaratech.MainActivity;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FragmentSignUpFragmentsBinding;

public class SignUpFragments extends Fragment {

    FragmentSignUpFragmentsBinding binding;
    public SignUpFragments() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignUpFragmentsBinding.inflate(inflater, container, false);
        binding.btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        return  binding.getRoot();
    }
}