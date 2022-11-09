package com.example.hiringmeaaratech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.FilterItemBinding;

import java.util.List;

public class FilterAdapter extends RecyclerView.Adapter<FilterAdapter.ViewHolder > {

    Context context;
    List<String>filterList;

    public FilterAdapter(Context context, List<String> filterList) {
        this.context = context;
        this.filterList = filterList;
    }

    @NonNull
    @Override
    public FilterAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.filter_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilterAdapter.ViewHolder holder, int position) {
        holder.binding.tvfilterName.setText(filterList.get(position));
    }

    @Override
    public int getItemCount() {
        return filterList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FilterItemBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = FilterItemBinding.bind(itemView);
        }
    }
}
