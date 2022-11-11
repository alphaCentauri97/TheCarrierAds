package com.example.hiringmeaaratech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.hiringmeaaratech.Fragments.WalletAdapter;
import com.example.hiringmeaaratech.Models.WalletModel;
import com.example.hiringmeaaratech.databinding.ActivityWalletBinding;

import java.util.ArrayList;
import java.util.List;

public class WalletActivity extends AppCompatActivity {

    WalletAdapter walletAdapter;
    List<WalletModel>walletList;
    ActivityWalletBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWalletBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        walletList = new ArrayList<>();
        binding.recyclerViewWallet.setLayoutManager(new LinearLayoutManager(this));
        walletList.add(new WalletModel(R.drawable.user_logo,"Invited to: Ratishanker Shukla",
                "\u20B9 "+"110","Date: 12/11/2022"));
        walletList.add(new WalletModel(R.drawable.user_logo,"Invited to: Ratishanker Shukla",
                "\u20B9 "+"110","Date: 12/11/2022"));
        walletList.add(new WalletModel(R.drawable.user_logo,"Invited to: Ratishanker Shukla",
                "\u20B9 "+"110","Date: 12/11/2022"));
        walletList.add(new WalletModel(R.drawable.user_logo,"Invited to: Ratishanker Shukla",
                "\u20B9 "+"110","Date: 12/11/2022"));
        walletAdapter = new WalletAdapter(this,walletList);
        binding.recyclerViewWallet.setAdapter(walletAdapter);
    }
}