package com.albagun.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.albagun.project.databinding.ActivityDetails7Binding;
import com.albagun.project.databinding.ActivityMain7Binding;

import java.util.ArrayList;

public class MainActivity7 extends AppCompatActivity {
    ArrayList<Landmark3> landmark3ArrayList;
    private ActivityMain7Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain7Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        landmark3ArrayList = new ArrayList<>();
        //Data
        Landmark3 shirt=new Landmark3("shirt","Gömlek",R.drawable.shirt);
        Landmark3 tshirt=new Landmark3("t-shirt","Tişört",R.drawable.tshirt);
        Landmark3 jeans=new Landmark3("Jeans", "Kot Pantalon", R.drawable.jeans);
        Landmark3 shorts=new Landmark3("Shorts","Şort",R.drawable.shorts);
        Landmark3 belt=new Landmark3("Belt","Kemer",R.drawable.belt);
        Landmark3 hat=new Landmark3("Hat","Şapka",R.drawable.hat);
        Landmark3 tie=new Landmark3("Tie","Kravat",R.drawable.tie);
        Landmark3 shoe=new Landmark3("Shoe","Ayakkabı",R.drawable.shoes);
        Landmark3 boot=new Landmark3("Boot","Bot",R.drawable.boot);
        Landmark3 dress=new Landmark3("Dress ","Elbise",R.drawable.dress);
        Landmark3 suit=new Landmark3("Suit","Takım Elbise",R.drawable.suit);
        Landmark3 jacket=new Landmark3("Jacket","Ceket",R.drawable.jacket);
        Landmark3 zipper=new Landmark3("Zipper","Fermuar",R.drawable.zipper);

        landmark3ArrayList.add(shirt);
        landmark3ArrayList.add(tshirt);
        landmark3ArrayList.add(jeans);
        landmark3ArrayList.add(shorts);
        landmark3ArrayList.add(belt);
        landmark3ArrayList.add(hat);
        landmark3ArrayList.add(tie);
        landmark3ArrayList.add(shoe);
        landmark3ArrayList.add(boot);
        landmark3ArrayList.add(dress);
        landmark3ArrayList.add(suit);
        landmark3ArrayList.add(jacket);
        landmark3ArrayList.add(zipper);

     binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
     LandMarkAdapter3 landMarkAdapter3 =new LandMarkAdapter3(landmark3ArrayList);
     binding.recyclerView.setAdapter(landMarkAdapter3);
    }
}