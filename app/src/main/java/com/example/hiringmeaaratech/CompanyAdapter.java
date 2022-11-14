package com.example.hiringmeaaratech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.databinding.CardCompaniesBinding;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    Context context;
    List<Integer>imgList;

    public CompanyAdapter(Context context, List<Integer> imgList) {
        this.context = context;
        this.imgList = imgList;
    }

    @NonNull
    @Override
    public CompanyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_companies,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyAdapter.ViewHolder holder, int position) {
        holder.binding.imageView6.setImageResource(imgList.get(position));
    }

    @Override
    public int getItemCount() {
        return imgList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardCompaniesBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardCompaniesBinding.bind(itemView);
        }
    }
}
