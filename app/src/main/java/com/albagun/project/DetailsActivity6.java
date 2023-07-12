package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails6Binding;

public class DetailsActivity6 extends AppCompatActivity {

    private ActivityDetails6Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails6Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark2 selectedlandmark = (Landmark2) intent.getSerializableExtra("landmark2");
        binding.ingText2.setText(selectedlandmark.english);
        binding.turText2.setText(selectedlandmark.turkish);
        binding.imageView19.setImageResource(selectedlandmark.image);
    }
}