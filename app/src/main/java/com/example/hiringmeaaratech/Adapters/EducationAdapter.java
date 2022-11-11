package com.example.hiringmeaaratech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.Models.ModelEducation;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardAddEducationBinding;

import java.util.List;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.ViewHolder> {

    Context context;
    List<ModelEducation> educationList;

    public EducationAdapter(Context context, List<ModelEducation> educationList) {
        this.context = context;
        this.educationList = educationList;
    }

    @NonNull
    @Override
    public EducationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_add_education,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EducationAdapter.ViewHolder holder, int position) {
        holder.binding.tvCollege.setText(educationList.get(position).getCollege());
        holder.binding.tveducation.setText(educationList.get(position).getEducation());
        holder.binding.tvYear.setText(educationList.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return educationList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardAddEducationBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardAddEducationBinding.bind(itemView);
        }
    }
}
