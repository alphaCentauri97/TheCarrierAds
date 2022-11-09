package com.example.hiringmeaaratech.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hiringmeaaratech.Models.ModelMessage;
import com.example.hiringmeaaratech.R;
import com.example.hiringmeaaratech.databinding.UserMessageBinding;

import java.util.List;

public class MessageAdapters extends RecyclerView.Adapter<MessageAdapters.ViewHolder>{

    private Context context;
    private List<ModelMessage> mMessageList;

    public MessageAdapters(Context mContext, List<ModelMessage> mMessageList) {
        this.context = mContext;
        this.mMessageList = mMessageList;
    }


    @NonNull
    @Override
    public MessageAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_message,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapters.ViewHolder holder, int position) {
        holder.binding.textGchatMessageMe.setText(mMessageList.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
        return mMessageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        UserMessageBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = UserMessageBinding.bind(itemView);
        }
    }
}
