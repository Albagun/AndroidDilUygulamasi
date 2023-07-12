package com.albagun.project;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.albagun.project.databinding.RcyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter6 extends RecyclerView.Adapter<LandMarkAdapter6.LandMarkHolder> {

    ArrayList<Landmark6> landMarkArrayList6;

    public LandMarkAdapter6(ArrayList<Landmark6> landMarkArrayList6) {
        this.landMarkArrayList6 = landMarkArrayList6;
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RcyclerRowBinding rcyclerRowBinding= RcyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandMarkHolder(rcyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkHolder holder, int position) {
        holder.binding.recylerViewTextView.setText(landMarkArrayList6.get(position).english);
    /*holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity7.class);
            //intent.putExtra("landmark3", (Serializable) landMarkArrayList3.get(position));
            holder.itemView.getContext().startActivity(intent);
        }
    });*/
        holder.itemView.setOnClickListener(view ->{

            Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity10.class);
            intent.putExtra("landmark6", landMarkArrayList6.get(position));
            holder.itemView.getContext().startActivity(intent);


        });

    }



    @Override
    public int getItemCount() {
        return landMarkArrayList6.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private RcyclerRowBinding binding;
        public LandMarkHolder(RcyclerRowBinding binding) {
            super(binding.getRoot());

            this.binding = binding;

        }


    }
}

