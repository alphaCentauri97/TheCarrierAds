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
import com.example.hiringmeaaratech.Models.ModelEducation;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.UpdateEducationDetailActivity;
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
        holder.binding.imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, UpdateEducationDetailActivity.class);
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
