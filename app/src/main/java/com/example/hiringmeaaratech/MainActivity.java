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
import android.view.Window;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.hiringmeaaratech.Fragments.HomeFragment;
import com.example.hiringmeaaratech.JobEmployer.HomeActivity;
import com.example.hiringmeaaratech.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
        homeTransaction.replace(R.id.content, new HomeFragment());
        homeTransaction.commit();

        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.drawer.openDrawer(GravityCompat.START);
            }
        });

        binding.toolbar.inflateMenu(R.menu.toolbar_menu);

        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {

                    case R.id.recommend_jobs:
                        intent = new Intent(MainActivity.this, RecommendedJobsActivity.class);
                        startActivity(intent);
                        break;
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
                    case R.id.notification:
                        intent = new Intent(MainActivity.this, NotificationActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.refer:
                        intent = new Intent(MainActivity.this, ReferActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.message:
                        intent = new Intent(MainActivity.this, ChatUiActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.settings:
                        intent = new Intent(MainActivity.this, SettingActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.wishlist:
                        intent = new Intent(MainActivity.this, SavedJobsActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.logout:
                        intent = new Intent(MainActivity.this, CareerStartPageActivity.class);
                        startActivity(intent);
                        break;

                }
                return true;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.toolbar_menu,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        int id = item.getItemId() ;
        if (id == R.id.search) {
            intent = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent);        }
        if (id == R.id.notification) {
            intent = new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(intent);
        }
        return super .onOptionsItemSelected(item) ;
    }

}