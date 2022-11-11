package com.example.hiringmeaaratech.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hiringmeaaratech.Fragments.EditProfileFragment.AboutMeFragment;
import com.example.hiringmeaaratech.Fragments.EditProfileFragment.EducationFragment;
import com.example.hiringmeaaratech.Fragments.EditProfileFragment.ExperinceFragment;

public class EditProfileFragmentAdapter extends FragmentStateAdapter {


    public EditProfileFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 0: return new AboutMeFragment();
            case 1: return new EducationFragment();
            case 2: return new ExperinceFragment();

            default: return new AboutMeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
