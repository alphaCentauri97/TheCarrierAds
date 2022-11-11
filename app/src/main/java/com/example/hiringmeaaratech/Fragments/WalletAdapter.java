package com.example.hiringmeaaratech.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.Models.WalletModel;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardWalletBinding;

import java.util.List;

public class WalletAdapter extends RecyclerView.Adapter<WalletAdapter.ViewHolder> {

    Context context;
    List<WalletModel>walletList;

    public WalletAdapter(Context context, List<WalletModel> walletList) {
        this.context = context;
        this.walletList = walletList;
    }

    @NonNull
    @Override
    public WalletAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_wallet,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WalletAdapter.ViewHolder holder, int position) {
        holder.binding.profileImage.setImageResource(walletList.get(position).getUser_profile());
        holder.binding.tvDate.setText(walletList.get(position).getDate());
        holder.binding.tvInvitationName.setText(walletList.get(position).getInvitationName());
        holder.binding.tvInvitationPrice.setText(walletList.get(position).getInvitationPrice());
    }

    @Override
    public int getItemCount() {
        return walletList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardWalletBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardWalletBinding.bind(itemView);
        }
    }
}
