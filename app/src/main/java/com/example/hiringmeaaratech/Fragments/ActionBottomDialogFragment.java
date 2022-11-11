package com.example.hiringmeaaratech.Fragments;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hiringmeaaratech.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ActionBottomDialogFragment extends BottomSheetDialogFragment {

    public static TabLayout tabLayout;
    ViewPager2 viewPager;

    private String[] titles = {"Log In","Sign Up"};


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action_bottom_dialog, container, false);
        tabLayout = view.findViewById(R.id.tab);
        viewPager = view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentAdapter(getActivity()));
        new TabLayoutMediator(tabLayout, viewPager, ((tab, position) -> tab.setText(titles[position]))).attach();

        //setStyle(STYLE_NO_FRAME, R.style.BottomSheetTheme);

        return view;
    }

}