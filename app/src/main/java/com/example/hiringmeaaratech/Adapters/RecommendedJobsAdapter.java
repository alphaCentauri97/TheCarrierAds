package com.example.hiringmeaaratech.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.CompanyProfilePage;
import com.example.hiringmeaaratech.Models.ModelRecommendedJobs;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardRecommendedJobsBinding;

import java.util.List;

public class RecommendedJobsAdapter extends RecyclerView.Adapter<RecommendedJobsAdapter.ViewHolder> {

    Context context;
    List<ModelRecommendedJobs> resultList;

    public RecommendedJobsAdapter(Context context, List<ModelRecommendedJobs> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public RecommendedJobsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_recommended_jobs,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedJobsAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.imgCompanyLogo.setImageResource(resultList.get(position).getImgCompany());
        holder.binding.tvCompanyName.setText(resultList.get(position).getCompany_name());
        holder.binding.tvlocation.setText(resultList.get(position).getLocation());
        holder.binding.tvTechnology.setText(resultList.get(position).getTechnology());
        holder.binding.tvInformation.setText(resultList.get(position).getDescription());
        holder.binding.tvJobType.setText(resultList.get(position).getJobType());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CompanyProfilePage.class);
                intent.putExtra("companyName",resultList.get(position).getCompany_name());
                intent.putExtra("location",resultList.get(position).getLocation());
                intent.putExtra("jobType",resultList.get(position).getJobType());
                intent.putExtra("technology",resultList.get(position).getTechnology());
                intent.putExtra("description",resultList.get(position).getDescription());
                intent.putExtra("imgCompany",resultList.get(position).getImgCompany());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardRecommendedJobsBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardRecommendedJobsBinding.bind(itemView);
        }
    }
}
