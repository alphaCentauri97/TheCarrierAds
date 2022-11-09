package com.example.hiringmeaaratech.Fragments;

import android.os.Bundle;

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

    TabLayout tabLayout;
    ViewPager2 viewPager;
    private String []titles = {"Sign Up", "Log In"};

    public ActionBottomDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_action_bottom_dialog, container, false);
        tabLayout = view.findViewById(R.id.tab);
        viewPager = view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragmentAdapter(getActivity()));
        new TabLayoutMediator(tabLayout,viewPager,((tab, position) ->tab.setText(titles[position]) )).attach();
        setStyle(STYLE_NORMAL,R.style.BottomSheetTheme);

        return view;
    }


}