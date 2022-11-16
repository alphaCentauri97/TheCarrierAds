package com.example.hiringmeaaratech.JobEmployer.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.JobEmployer.Model.ModelDays;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.CardDaysBinding;

import java.util.List;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.ViewHolder> {

    Context context;
    List<ModelDays>daysList;

    public DaysAdapter(Context context, List<ModelDays> daysList) {
        this.context = context;
        this.daysList = daysList;
    }

    @NonNull
    @Override
    public DaysAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_days,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DaysAdapter.ViewHolder holder, int position) {
        holder.binding.tvdays.setText(daysList.get(position).getDays());
    }

    @Override
    public int getItemCount() {
        return daysList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardDaysBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CardDaysBinding.bind(itemView);
        }
    }
}
