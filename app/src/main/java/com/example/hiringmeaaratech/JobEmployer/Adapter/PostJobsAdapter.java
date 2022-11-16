package com.example.hiringmeaaratech.JobEmployer.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.JobEmployer.EmployerCompanyProfileActivity;
import com.example.hiringmeaaratech.JobEmployer.ModelPostJobs;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardPostedJobsBinding;

import java.util.List;

public class PostJobsAdapter extends RecyclerView.Adapter<PostJobsAdapter.ViewHolder> {

    Context context;
    List<ModelPostJobs> postJobsList;

    public PostJobsAdapter(Context context, List<ModelPostJobs> postJobsList) {
        this.context = context;
        this.postJobsList = postJobsList;
    }

    @NonNull
    @Override
    public PostJobsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_posted_jobs,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostJobsAdapter.ViewHolder holder, int position) {
        holder.binding.imgCompanyLogo.setImageResource(postJobsList.get(position).getImgCompany());
        holder.binding.tvTechnology.setText(postJobsList.get(position).getTechnology());
        holder.binding.tvlocation.setText(postJobsList.get(position).getLocation());
        holder.binding.tvJobType.setText(postJobsList.get(position).getJobType());
        holder.binding.tvExperience.setText(postJobsList.get(position).getExperience());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EmployerCompanyProfileActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return postJobsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardPostedJobsBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardPostedJobsBinding.bind(itemView);
        }
    }
}
