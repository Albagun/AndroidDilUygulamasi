package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails8Binding;

public class DetailsActivity8 extends AppCompatActivity {

    private ActivityDetails8Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails8Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Landmark4 selectedlandmark = (Landmark4) intent.getSerializableExtra("landmark4");
        binding.ingText4.setText(selectedlandmark.english);
        binding.turText4.setText(selectedlandmark.turkish);
        binding.imageView21.setImageResource(selectedlandmark.image);

    }
}