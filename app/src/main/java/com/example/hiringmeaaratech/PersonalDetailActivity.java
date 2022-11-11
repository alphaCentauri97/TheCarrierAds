package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.hiringmeaaratech.databinding.ActivityPersonalDetailBinding;

public class PersonalDetailActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ActivityPersonalDetailBinding binding;
    Spinner country_spinner,state_spinner,city_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);

        country_spinner = findViewById(R.id.spinner_country);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinner_country,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country_spinner.setAdapter(adapter);
        country_spinner.setOnItemSelectedListener(this);

        state_spinner = findViewById(R.id.spinner_state);
        ArrayAdapter<CharSequence> stateAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_state,
                android.R.layout.simple_spinner_item);
        stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state_spinner.setAdapter(stateAdapter);
        state_spinner.setOnItemSelectedListener(this);

        city_spinner = findViewById(R.id.spinner_city);
        ArrayAdapter<CharSequence> cityAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_city,
                android.R.layout.simple_spinner_item);
        cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city_spinner.setAdapter(cityAdapter);
        city_spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Toast.makeText(this, "You Select: "+adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}