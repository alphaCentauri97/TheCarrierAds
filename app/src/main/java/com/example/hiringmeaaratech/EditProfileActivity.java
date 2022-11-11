package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hiringmeaaratech.Adapters.EditProfileFragmentAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class EditProfileActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    ImageView backArrow,imgProfessionalDetail;
    CardView editbtn;
    private String []titles = {"About Me", "Education","Experience"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);
        backArrow = findViewById(R.id.back_arrow);
        editbtn = findViewById(R.id.editbtn);
        imgProfessionalDetail = findViewById(R.id.imgPersonalEdit);

        viewPager.setAdapter(new EditProfileFragmentAdapter(this));
        new TabLayoutMediator(tabLayout,viewPager,((tab, position) ->tab.setText(titles[position]) )).attach();

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditProfileActivity.this, BasicDetailsActivity.class);
                startActivity(intent);
            }
        });

        imgProfessionalDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditProfileActivity.this, SkillActivity.class);
                startActivity(intent);
            }
        });



    }
}