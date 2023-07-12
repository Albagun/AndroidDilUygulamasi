package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails10Binding;

public class DetailsActivity10 extends AppCompatActivity {

    private ActivityDetails10Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails10Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark6 selectedlandmark = (Landmark6) intent.getSerializableExtra("landmark6");

        binding.engText6.setText(selectedlandmark.english);
        binding.turText6.setText(selectedlandmark.turkish);
        binding.imageView23.setImageResource(selectedlandmark.image);
    }
}