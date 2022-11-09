package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.hiringmeaaratech.Adapters.MessageAdapters;
import com.example.hiringmeaaratech.Models.ModelMessage;
import com.example.hiringmeaaratech.databinding.ActivityChatUiBinding;
import com.example.hiringmeaaratech.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class ChatUiActivity extends AppCompatActivity {

    ActivityChatUiBinding binding;
    MessageAdapters adapters;
    List<ModelMessage> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatUiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        list = new ArrayList<>();

        binding.recyclerViewChat.setLayoutManager(new LinearLayoutManager(this));

        binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = binding.etmessage.getText().toString();
                list.add(new ModelMessage(message));
                adapters = new MessageAdapters(ChatUiActivity.this,list);
                binding.recyclerViewChat.setAdapter(adapters);

            }
        });
        binding.attachFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(ChatUiActivity.this);
                dialog.setContentView(R.layout.attach_file);
                dialog.show();
            }
        });




    }
}