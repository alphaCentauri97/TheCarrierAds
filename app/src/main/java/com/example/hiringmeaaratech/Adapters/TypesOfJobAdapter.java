package com.example.hiringmeaaratech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.Models.ModelTypesOfJob;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardTypeofJobsBinding;

import java.util.List;

public class TypesOfJobAdapter extends RecyclerView.Adapter<TypesOfJobAdapter.ViewHolder> {

    Context context;
    List<ModelTypesOfJob>typesOfJobList;

    public TypesOfJobAdapter(Context context, List<ModelTypesOfJob> typesOfJobList) {
        this.context = context;
        this.typesOfJobList = typesOfJobList;
    }

    @NonNull
    @Override
    public TypesOfJobAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_typeof_jobs,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypesOfJobAdapter.ViewHolder holder, int position) {
        holder.binding.tvPostdate.setText(typesOfJobList.get(position).getPost_date());
        holder.binding.tvjobName.setText(typesOfJobList.get(position).getJobName());
        holder.binding.tvLastDate.setText(typesOfJobList.get(position).getLast_date());
        holder.binding.tvStartDate.setText(typesOfJobList.get(position).getStart_date());
        holder.binding.tvDescription.setText(typesOfJobList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return typesOfJobList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardTypeofJobsBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardTypeofJobsBinding.bind(itemView);
        }
    }
}
