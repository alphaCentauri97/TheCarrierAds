package com.example.hiringmeaaratech;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.hiringmeaaratech.Adapters.UserResultAdapter;
import com.example.hiringmeaaratech.Fragments.ActionBottomDialogFragment;
import com.example.hiringmeaaratech.Fragments.BottomNavigation.DashBoardFragment;
import com.example.hiringmeaaratech.Fragments.BottomNavigation.SearchFragment;
import com.example.hiringmeaaratech.Fragments.BottomNavigation.UserDetailFragment;
import com.example.hiringmeaaratech.Models.ModelUserResult;
import com.example.hiringmeaaratech.databinding.ActivityMainBinding;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);


        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.drawer.openDrawer(GravityCompat.START);
            }
        });


        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {

                    case R.id.writeToUse:
                        intent = new Intent(MainActivity.this, WriteUsActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.about_us:
                        intent = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(intent);
                        break;
                    case R.id.wallet:
                        intent = new Intent(MainActivity.this, WalletActivity.class);
                        startActivity(intent);
                        break;

                }
                return true;
            }
        });


        FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
        homeTransaction.replace(R.id.content, new SearchFragment());
        homeTransaction.commit();


        binding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {


                    case R.id.search:
                        FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
                        homeTransaction.replace(R.id.content, new SearchFragment());
                        homeTransaction.commit();
                        break;
                    case R.id.dashboard:
                        FragmentTransaction picTransaction = getSupportFragmentManager().beginTransaction();
                        picTransaction.replace(R.id.content, new DashBoardFragment());
                        picTransaction.commit();
                        break;
                    case R.id.user:
                        FragmentTransaction camTransaction = getSupportFragmentManager().beginTransaction();
                        camTransaction.replace(R.id.content, new UserDetailFragment());
                        camTransaction.commit();
                        break;




                }


                return true;
            }
        });

        binding.profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        View headerView = binding.navigationView.getHeaderView(0);
        headerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EditProfileActivity.class);
                startActivity(intent);
            }
        });

    }



}