package com.albagun.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.albagun.project.databinding.ActivityDetails5Binding;

public class DetailsActivity5 extends AppCompatActivity {

    private ActivityDetails5Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetails5Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        LandMark selectedlandmark = (LandMark) intent.getSerializableExtra("landmark");
        binding.ingText.setText(selectedlandmark.english);
        binding.turText.setText(selectedlandmark.turkish);
        binding.imageView18.setImageResource(selectedlandmark.image);

    }
}