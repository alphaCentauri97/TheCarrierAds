package com.example.hiringmeaaratech.JobEmployer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.hiringmeaaratech.JobEmployer.Fragment.InterviewFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.MainFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.NewApplicants;
import com.example.hiringmeaaratech.JobEmployer.Fragment.OnHoldFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.RejectionsFragment;
import com.example.hiringmeaaratech.JobEmployer.Fragment.ShortListFragment;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.ActivityCompanyProfilePageBinding;
import com.example.hiringmeaaratech.databinding.ActivityEmployerCompanyProfileBinding;

public class EmployerCompanyProfileActivity extends AppCompatActivity {

    ActivityEmployerCompanyProfileBinding binding;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmployerCompanyProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        binding.toolbar.inflateMenu(R.menu.employer_company_toolbar);

        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.employer_company_toolbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.edit:
                intent = new Intent(EmployerCompanyProfileActivity.this, CreateNewJobActivity.class);
                startActivity(intent);
                break;

            case R.id.delete:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                break;

            case R.id.openJob:
                Toast.makeText(this, "Open Job", Toast.LENGTH_SHORT).show();
                break;

            case R.id.pauseJob:
                Toast.makeText(this, "Pause Job", Toast.LENGTH_SHORT).show();
                break;

            case R.id.closeJob:
                Toast.makeText(this, "Close Job", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

}