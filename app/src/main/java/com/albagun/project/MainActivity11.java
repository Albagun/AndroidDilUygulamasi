package com.albagun.project;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.albagun.project.databinding.ActivityMain11Binding;

import java.util.ArrayList;

public class MainActivity11 extends AppCompatActivity {
    ArrayList<Landmark7> landmark7ArrayList;
    private ActivityMain11Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain11Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmark7ArrayList = new ArrayList<>();

        Landmark7 cat=new Landmark7("cat","Kedi",R.drawable.cat);
        Landmark7 dog=new Landmark7("dog","Köpek",R.drawable.dog);
        Landmark7 horse=new Landmark7("horse", "at", R.drawable.horse);
        Landmark7 lion=new Landmark7("lion","Aslan",R.drawable.lion);
        Landmark7 bee=new Landmark7("bee","arı",R.drawable.bee);
        Landmark7 rabbit=new Landmark7("rabbit","tavşan",R.drawable.rabbit);
        Landmark7 wolf=new Landmark7("wolf","kurt",R.drawable.wolf);
        Landmark7 bear=new Landmark7("bear","ayı",R.drawable.bear);
        Landmark7 owl=new Landmark7("owl","baykuş",R.drawable.owl);
        Landmark7 cow=new Landmark7("cow ","inek",R.drawable.cow);
        Landmark7 fox=new Landmark7("fox","Tilki",R.drawable.fox);
        Landmark7 bat=new Landmark7("bat","Yarasa",R.drawable.bat);
        Landmark7 snake=new Landmark7("snake","yılan",R.drawable.snake);
        Landmark7 duck=new Landmark7("duck","ördek",R.drawable.duck);


        landmark7ArrayList.add(cat);
        landmark7ArrayList.add(dog);
        landmark7ArrayList.add(horse);
        landmark7ArrayList.add(lion);
        landmark7ArrayList.add(bee);
        landmark7ArrayList.add(rabbit);
        landmark7ArrayList.add(wolf);
        landmark7ArrayList.add(bear);
        landmark7ArrayList.add(owl);
        landmark7ArrayList.add(cow);
        landmark7ArrayList.add(fox);
        landmark7ArrayList.add(bat);
        landmark7ArrayList.add(snake);
        landmark7ArrayList.add(duck);

        binding.recyclerView7.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter7 landMarkAdapter7 = new LandMarkAdapter7(landmark7ArrayList);
        binding.recyclerView7.setAdapter(landMarkAdapter7);


    }
}