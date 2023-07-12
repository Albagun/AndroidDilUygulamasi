package com.albagun.project;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.albagun.project.databinding.ActivityMain9Binding;

import java.util.ArrayList;

public class MainActivity9 extends AppCompatActivity {

    ArrayList<Landmark5>landmark5ArrayList;
    private ActivityMain9Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain9Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmark5ArrayList = new ArrayList<>();

        Landmark5 bagel=new Landmark5("bagel","simit",R.drawable.bagel);
        Landmark5 baguette=new Landmark5("baguette","baget",R.drawable.baguette);
        Landmark5 cake=new Landmark5("cake", "kek", R.drawable.cake);
        Landmark5 candy=new Landmark5("candy","şeker",R.drawable.candy);
        Landmark5 cheese=new Landmark5("cheese","peynir",R.drawable.cheese);
        Landmark5 chicken=new Landmark5("chicken","tavuk",R.drawable.chicken);
        Landmark5 chocolate=new Landmark5("chocolate","Çikolata",R.drawable.chocolate);
        Landmark5 coffee=new Landmark5("coffee","Kahve",R.drawable.coffee);
        Landmark5 cookie=new Landmark5("cookie","kurabiye",R.drawable.cookie);
        Landmark5 crackers=new Landmark5("crackers ","kraker",R.drawable.crackers);
        Landmark5 egg=new Landmark5("egg","yumuruta",R.drawable.egg);
        Landmark5 fish=new Landmark5("fish","Göz Damlası",R.drawable.eyedrops);
        Landmark5 milk=new Landmark5("milk","süt",R.drawable.milk);
        Landmark5 ice_cream=new Landmark5("ice cream","dondurma",R.drawable.icecream);
        Landmark5 soup=new Landmark5("soup","Çorba",R.drawable.soup);

        landmark5ArrayList.add(bagel);
        landmark5ArrayList.add(baguette);
        landmark5ArrayList.add(cake);
        landmark5ArrayList.add(candy);
        landmark5ArrayList.add(cheese);
        landmark5ArrayList.add(chicken);
        landmark5ArrayList.add(chocolate);
        landmark5ArrayList.add(coffee);
        landmark5ArrayList.add(cookie);
        landmark5ArrayList.add(crackers);
        landmark5ArrayList.add(egg);
        landmark5ArrayList.add(fish);
        landmark5ArrayList.add(milk);
        landmark5ArrayList.add(ice_cream);
        landmark5ArrayList.add(soup);

        binding.recyclerView5.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter5 landMarkAdapter5 = new LandMarkAdapter5(landmark5ArrayList);
        binding.recyclerView5.setAdapter(landMarkAdapter5);


    }
}