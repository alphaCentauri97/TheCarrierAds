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
import com.example.hiringmeaaratech.Models.ModelUserResult;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.UserResultCardviewBinding;

import java.util.List;

public class UserResultAdapter extends RecyclerView.Adapter<UserResultAdapter.ViewHolder> {

    Context context;
    List<ModelUserResult> resultList;

    public UserResultAdapter(Context context, List<ModelUserResult> resultList) {
        this.context = context;
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public UserResultAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_result_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserResultAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.imageView4.setImageResource(resultList.get(position).getImg());
        holder.binding.tvCompanyName.setText(resultList.get(position).getCompany_name());
        holder.binding.tvlocation.setText(resultList.get(position).getLocation());
        holder.binding.tvJobType.setText(resultList.get(position).getJobType());
        holder.binding.tvExperience.setText("Eligibility: "+resultList.get(position).getExperience());
        holder.binding.tvSalary.setText(resultList.get(position).getSalary());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CompanyProfilePage.class);
                intent.putExtra("companyName",resultList.get(position).getCompany_name());
                intent.putExtra("location",resultList.get(position).getLocation());
                intent.putExtra("jobType",resultList.get(position).getJobType());
                intent.putExtra("experience",resultList.get(position).getExperience());
                intent.putExtra("salary",resultList.get(position).getSalary());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        UserResultCardviewBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = UserResultCardviewBinding.bind(itemView);
        }
    }
}
