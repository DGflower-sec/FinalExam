package com.example.myfinal.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TuijianAdapter extends RecyclerView.Adapter<TuijianAdapter.TuijianViewHolder> {


    @NonNull
    @Override
    public TuijianAdapter.TuijianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TuijianAdapter.TuijianViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TuijianViewHolder extends RecyclerView.ViewHolder {
        public TuijianViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
