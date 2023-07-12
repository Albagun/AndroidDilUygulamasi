package com.albagun.project;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.albagun.project.databinding.ActivityMain5Binding;

import java.util.ArrayList;


public class MainActivity5 extends AppCompatActivity {

    ArrayList<LandMark> landmarkArrayList;
    private ActivityMain5Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        //Data
        LandMark guestroom=new LandMark("Guest Room","Misafir Odası",R.drawable.misafirod);
    LandMark livingroom=new LandMark("Living Room","Oturma Odası",R.drawable.oturmaod);
    LandMark diningroom=new LandMark("Dining Room", "Yemek Odası", R.drawable.yemekod);
    LandMark bedroom=new LandMark("Bedroom","Yatak Odası",R.drawable.yatakod);
    LandMark kitchen=new LandMark("Kitchen","Mutfak",R.drawable.mutfak);
    LandMark bathroom=new LandMark("Bathroom","Banyo",R.drawable.banyo);
    LandMark roof=new LandMark("Roof","Çatı",R.drawable.roof);
    LandMark floor=new LandMark("Floor","Zemin",R.drawable.floor);
    LandMark wall=new LandMark("Wall","Duvar",R.drawable.duvar);
    LandMark door=new LandMark("Door","Kapı",R.drawable.door);
    LandMark window=new LandMark("Window","Pencere",R.drawable.pencere);
    LandMark stairs=new LandMark("Stairs","Merdiven",R.drawable.merdiven);
    LandMark garage=new LandMark("Garage","Garaj",R.drawable.garaj);
    LandMark balcony=new LandMark("Balcony","Balkon",R.drawable.balkon);

    landmarkArrayList.add(guestroom);
    landmarkArrayList.add(livingroom);
    landmarkArrayList.add(diningroom);
    landmarkArrayList.add(bedroom);
    landmarkArrayList.add(kitchen);
    landmarkArrayList.add(bathroom);
    landmarkArrayList.add(roof);
    landmarkArrayList.add(floor);
    landmarkArrayList.add(wall);
    landmarkArrayList.add(door);
    landmarkArrayList.add(window);
    landmarkArrayList.add(stairs);
    landmarkArrayList.add(garage);
    landmarkArrayList.add(balcony);

        binding.recyclerView4.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter landMarkAdapter =new LandMarkAdapter(landmarkArrayList);
        binding.recyclerView4.setAdapter(landMarkAdapter);

    }
}