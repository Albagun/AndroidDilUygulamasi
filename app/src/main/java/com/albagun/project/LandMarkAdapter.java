package com.albagun.project;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.albagun.project.databinding.RcyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder> {

    ArrayList<LandMark> landMarkArrayList;

    public LandMarkAdapter(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RcyclerRowBinding rcyclerRowBinding= RcyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandMarkHolder(rcyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {
        holder.binding.recylerViewTextView.setText(landMarkArrayList.get(position).english);

        holder.itemView.setOnClickListener(view ->{

            Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity5.class);
            intent.putExtra("landmark", landMarkArrayList.get(position));
            holder.itemView.getContext().startActivity(intent);


        });

    }



    @Override
    public int getItemCount() {
        return landMarkArrayList.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private RcyclerRowBinding binding;
        public LandMarkHolder(RcyclerRowBinding binding) {
            super(binding.getRoot());

            this.binding = binding;

        }


    }
}

