package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails7Binding;

public class DetailsActivity7 extends AppCompatActivity {

    private ActivityDetails7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails7Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark3 selected1landmark = (Landmark3) intent.getSerializableExtra("landmark3");
        binding.ingText3.setText(selected1landmark.english);
        binding.turText3.setText(selected1landmark.turkish);
        binding.imageView20.setImageResource(selected1landmark.image);
    }


}