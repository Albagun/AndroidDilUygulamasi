package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails9Binding;

public class DetailsActivity9 extends AppCompatActivity {

    private ActivityDetails9Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails9Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark5 selectedlandmark = (Landmark5) intent.getSerializableExtra("landmark5");
        binding.ingText5.setText(selectedlandmark.english);
        binding.turText5.setText(selectedlandmark.turkish);
        binding.imageView22.setImageResource(selectedlandmark.image);
    }
}