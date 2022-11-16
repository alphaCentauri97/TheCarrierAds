package com.example.hiringmeaaratech.JobEmployer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.hiringmeaaratech.AboutUs;
import com.example.hiringmeaaratech.CareerStartPageActivity;
import com.example.hiringmeaaratech.ChatUiActivity;
import com.example.hiringmeaaratech.JobEmployer.Fragment.InterviewFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.MainFragment;

import com.example.hiringmeaaratech.JobEmployer.Fragment.NewApplicants;
import com.example.hiringmeaaratech.JobEmployer.Fragment.OnHoldFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.RejectionsFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.ShortListFragment;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.SettingActivity;
import com.example.hiringmeaaratech.WriteUsActivity;
import com.example.hiringmeaaratech.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityHomeBinding binding;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);


        FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
        homeTransaction.replace(R.id.content, new MainFragment());
        homeTransaction.commit();


        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.drawer.openDrawer(GravityCompat.START);
            }
        });

        binding.toolbar.inflateMenu(R.menu.employer_toolbar);

        binding.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                binding.drawer.closeDrawer(GravityCompat.START);
                switch (id) {


                    case R.id.home:
                        intent = new Intent(HomeActivity.this, HomeActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.savedResume:
                        Toast.makeText(HomeActivity.this, "Save Jobs", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.postJobs:
                        intent = new Intent(HomeActivity.this, CreateNewJobActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.message:
                        intent = new Intent(HomeActivity.this, ChatUiActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.settings:
                        intent = new Intent(HomeActivity.this, SettingActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.writeToUse:
                        intent = new Intent(HomeActivity.this, WriteUsActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.about_us:
                        intent = new Intent(HomeActivity.this, AboutUs.class);
                        startActivity(intent);
                        break;

                    case R.id.logout:
                        intent = new Intent(HomeActivity.this, CareerStartPageActivity.class);
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
                Intent intent = new Intent(HomeActivity.this, EmployerProfileActivity.class);
                startActivity(intent);
            }
        });
        binding.imgHome.setOnClickListener(this);
        binding.newApplicants.setOnClickListener(this);
        binding.shortlist.setOnClickListener(this);
        binding.onHold.setOnClickListener(this);
        binding.interviewed.setOnClickListener(this);
        binding.rejections.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.employer_toolbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.search) {
            Toast.makeText(HomeActivity.this, "Search", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.notification) {
            Toast.makeText(HomeActivity.this, "notification", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.newApplicants:
                FragmentTransaction homeTransaction = getSupportFragmentManager().beginTransaction();
                homeTransaction.replace(R.id.content, new NewApplicants());
                homeTransaction.commit();
                break;
            case R.id.imgHome:
                FragmentTransaction imgTransaction = getSupportFragmentManager().beginTransaction();
                imgTransaction.replace(R.id.content, new MainFragment());
                imgTransaction.commit();
                break;
            case R.id.onHold:
                FragmentTransaction onHoldTransaction = getSupportFragmentManager().beginTransaction();
                onHoldTransaction.replace(R.id.content, new OnHoldFragment());
                onHoldTransaction.commit();
                break;
            case R.id.interviewed:
                FragmentTransaction interviewedTransaction = getSupportFragmentManager().beginTransaction();
                interviewedTransaction.replace(R.id.content, new InterviewFragment());
                interviewedTransaction.commit();
                break;
            case R.id.shortlist:
                FragmentTransaction shortListTransaction = getSupportFragmentManager().beginTransaction();
                shortListTransaction.replace(R.id.content, new ShortListFragment());
                shortListTransaction.commit();
                break;
            case R.id.rejections:
                FragmentTransaction rejectionsTransaction = getSupportFragmentManager().beginTransaction();
                rejectionsTransaction.replace(R.id.content, new RejectionsFragment());
                rejectionsTransaction.commit();
                break;

        }
    }
}