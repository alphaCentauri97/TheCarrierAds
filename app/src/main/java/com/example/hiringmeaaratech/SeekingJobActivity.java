package com.example.hiringmeaaratech;

import static androidx.fragment.app.DialogFragment.STYLE_NORMAL;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.Fragments.ActionBottomDialogFragment;
import com.example.hiringmeaaratech.databinding.ActivitySeekingJobBinding;

public class SeekingJobActivity extends AppCompatActivity {

    ActivitySeekingJobBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekingJobBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActionBottomDialogFragment fragment = new ActionBottomDialogFragment();
                fragment.show(getSupportFragmentManager(), "TAG");
                fragment.setStyle(STYLE_NORMAL,R.style.BottomSheetTheme);
            }
        });



    }
}