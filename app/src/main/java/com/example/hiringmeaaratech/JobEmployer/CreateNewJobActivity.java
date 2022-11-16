package com.example.hiringmeaaratech.JobEmployer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.JobEmployer.Adapter.DaysAdapter;
import com.example.hiringmeaaratech.JobEmployer.Model.ModelDays;
import com.example.hiringmeaaratech.databinding.ActivityCreateNewJobBinding;

import java.util.ArrayList;
import java.util.List;

public class CreateNewJobActivity extends AppCompatActivity {

    ActivityCreateNewJobBinding binding;
    List<ModelDays>daysList;
    DaysAdapter daysAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateNewJobBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        daysList = new ArrayList<>();
        binding.recyclerViewDays.setLayoutManager(new StaggeredGridLayoutManager(2, RecyclerView.HORIZONTAL));
        daysList.add(new ModelDays("Monday"));
        daysList.add(new ModelDays("Tuesday"));
        daysList.add(new ModelDays("Wednesday"));
        daysList.add(new ModelDays("Thursday"));
        daysList.add(new ModelDays("Friday"));
        daysList.add(new ModelDays("Saturday"));
        daysList.add(new ModelDays("Sunday"));

        daysAdapter = new DaysAdapter(this,daysList);
        binding.recyclerViewDays.setAdapter(daysAdapter);

        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}