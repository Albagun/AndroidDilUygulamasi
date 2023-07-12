package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails11Binding;

public class DetailsActivity11 extends AppCompatActivity {

    private ActivityDetails11Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails11Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark7 selected1landmark = (Landmark7) intent.getSerializableExtra("landmark7");
        binding.engText7.setText(selected1landmark.english);
        binding.turText7.setText(selected1landmark.turkish);
        binding.imageView25.setImageResource(selected1landmark.image);
    }
}