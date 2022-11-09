package com.example.hiringmeaaratech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.JobTypeItemBinding;

import java.util.List;

import kotlinx.coroutines.Job;

public class JobTypeAdapter extends RecyclerView.Adapter<JobTypeAdapter.ViewHolder> {

    Context context;
    List<String>jobtypeList;

    public JobTypeAdapter(Context context, List<String> jobtypeList) {
        this.context = context;
        this.jobtypeList = jobtypeList;
    }

    @NonNull
    @Override
    public JobTypeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.job_type_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobTypeAdapter.ViewHolder holder, int position) {
        holder.binding.tvJobType.setText(jobtypeList.get(position));
    }

    @Override
    public int getItemCount() {
        return jobtypeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        JobTypeItemBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = JobTypeItemBinding.bind(itemView);
        }
    }
}
