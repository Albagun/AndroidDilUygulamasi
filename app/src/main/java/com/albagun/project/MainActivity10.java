package com.albagun.project;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.albagun.project.databinding.ActivityMain10Binding;

import java.util.ArrayList;

public class MainActivity10 extends AppCompatActivity {

    ArrayList<Landmark6> landmark6ArrayList;
    private ActivityMain10Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain10Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmark6ArrayList = new ArrayList<>();

        Landmark6 farmer=new Landmark6("farmer","çiftçi",R.drawable.farmer);
        Landmark6 fisherman=new Landmark6("fisherman","Balıkçı",R.drawable.fisherman);
        Landmark6 fireman=new Landmark6("fireman", "İtfaiyeci", R.drawable.fireman);
        Landmark6 gardener=new Landmark6("gardener","bahçıvan",R.drawable.gardener);
        Landmark6 baker=new Landmark6("baker","fırıncı",R.drawable.baker);
        Landmark6 butcher=new Landmark6("butcher","kasap",R.drawable.butcher);
        Landmark6 journalist=new Landmark6("journalist","gazeteci",R.drawable.journalist);
        Landmark6 lawyer=new Landmark6("lawyer","avukat",R.drawable.lawyer);
        Landmark6 doctor=new Landmark6("doctor","doktor",R.drawable.doctor);
        Landmark6 engineer=new Landmark6("engineer ","mühendis",R.drawable.engineer);
        Landmark6 soldier=new Landmark6("soldier","asker",R.drawable.soldier);
        Landmark6 pilot=new Landmark6("pilot","pilot",R.drawable.pilot);


        landmark6ArrayList.add(farmer);
        landmark6ArrayList.add(fisherman);
        landmark6ArrayList.add(fireman);
        landmark6ArrayList.add(gardener);
        landmark6ArrayList.add(baker);
        landmark6ArrayList.add(butcher);
        landmark6ArrayList.add(journalist);
        landmark6ArrayList.add(lawyer);
        landmark6ArrayList.add(doctor);
        landmark6ArrayList.add(engineer);
        landmark6ArrayList.add(soldier);
        landmark6ArrayList.add(pilot);

        binding.recyclerView6.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter6 landMarkAdapter6 = new LandMarkAdapter6(landmark6ArrayList);
        binding.recyclerView6.setAdapter(landMarkAdapter6);

    }
}