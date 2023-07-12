package com.albagun.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.albagun.project.databinding.ActivityMain6Binding;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {
    ArrayList<Landmark2> landmark2ArrayList;
    private ActivityMain6Binding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain6Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landmark2ArrayList = new ArrayList<>();
        //Data
        Landmark2 father=new Landmark2("Father","Baba",R.drawable.father);
        Landmark2 mother=new Landmark2("Mother","Anne",R.drawable.mother);
        Landmark2 husband=new Landmark2("Husband", "Koca", R.drawable.husband);
        Landmark2 wife=new Landmark2("Wife","Hanım",R.drawable.wife);
        Landmark2 son=new Landmark2("Son","Oğlan Evlat",R.drawable.son);
        Landmark2 daughter=new Landmark2("Daughter","Kız Evlat",R.drawable.daughter);
        Landmark2 brother=new Landmark2("Brother","Erkek Kardeş",R.drawable.brother);
        Landmark2 sister=new Landmark2("Sister","Kız Kardeş",R.drawable.sister);
        Landmark2 grandfather=new Landmark2("GrandFather","Büyük Baba",R.drawable.grandfather);
        Landmark2 grandmother=new Landmark2("Grandmother ","Büyük Anne",R.drawable.grandmother);
        Landmark2 uncle=new Landmark2("Uncle","Amca",R.drawable.uncle);
        Landmark2 aunt=new Landmark2("Aunt","Teyze",R.drawable.aunt);
        Landmark2 cousin=new Landmark2("Cousin","Kuzen",R.drawable.cousin);

        landmark2ArrayList.add(father);
        landmark2ArrayList.add(mother);
        landmark2ArrayList.add(husband);
        landmark2ArrayList.add(wife);
        landmark2ArrayList.add(son);
        landmark2ArrayList.add(daughter);
        landmark2ArrayList.add(brother);
        landmark2ArrayList.add(sister);
        landmark2ArrayList.add(grandfather);
        landmark2ArrayList.add(grandmother);
        landmark2ArrayList.add(uncle);
        landmark2ArrayList.add(aunt);
        landmark2ArrayList.add(cousin);

    binding.recyclerView3.setLayoutManager(new LinearLayoutManager(this));
    LandMarkAdapter2 landMarkAdapter2 =new LandMarkAdapter2(landmark2ArrayList);
    binding.recyclerView3.setAdapter(landMarkAdapter2);
    }
}