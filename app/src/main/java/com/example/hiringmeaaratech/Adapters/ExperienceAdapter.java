package com.example.hiringmeaaratech.Adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.EditProfessionalDetailActivity;
import com.example.hiringmeaaratech.Models.ModelExperience;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardExperienceBinding;

import java.util.List;

public class ExperienceAdapter extends RecyclerView.Adapter<ExperienceAdapter.ViewHolder> {

    Context context;
    List<ModelExperience> experienceList;

    public ExperienceAdapter(Context context, List<ModelExperience> experienceList) {
        this.context = context;
        this.experienceList = experienceList;
    }

    @NonNull
    @Override
    public ExperienceAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_experience,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExperienceAdapter.ViewHolder holder, int position) {
        holder.binding.tvCompany.setText(experienceList.get(position).getCompany());
        holder.binding.tvDate.setText(experienceList.get(position).getStart_date());
        holder.binding.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EditProfessionalDetailActivity.class);
                context.startActivity(intent);
            }
        });
        holder.binding.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Are you sure want to delete this?");
                builder.setTitle("Delete !");
                builder.setCancelable(true);
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       dialogInterface.cancel();
                    }
                });
                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return experienceList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardExperienceBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardExperienceBinding.bind(itemView);
        }
    }
}
