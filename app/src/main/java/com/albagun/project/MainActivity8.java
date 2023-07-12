package com.albagun.project;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.albagun.project.databinding.ActivityMain8Binding;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    ArrayList<Landmark4>landmark4ArrayList;
    private ActivityMain8Binding binding;
    static Landmark4 chosenlandmark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain8Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        landmark4ArrayList = new ArrayList<>();

        Landmark4 plaster=new Landmark4("Plaster","Yara Bandı",R.drawable.plaster);
        Landmark4 bandage=new Landmark4("Bandage","Bandaj",R.drawable.bandage);
        Landmark4 stretcher=new Landmark4("Stretcher", "Sedye", R.drawable.stretcher);
        Landmark4 pill=new Landmark4("Pill","Hap",R.drawable.pill);
        Landmark4 ointment=new Landmark4("Ointment","Merhem",R.drawable.ointment);
        Landmark4 ambulance=new Landmark4("Ambulance","Ambulans",R.drawable.ambulance);
        Landmark4 syrup=new Landmark4("Syrup","Şurup",R.drawable.syrup);
        Landmark4 patient=new Landmark4("Patient","Hasta",R.drawable.patient);
        Landmark4 dentist=new Landmark4("Dentist","Dişçi",R.drawable.dentist);
        Landmark4 nurse=new Landmark4("Nurse ","Hemşire",R.drawable.nurse);
        Landmark4 hospital=new Landmark4("Hospital","Hastane",R.drawable.hospital);
        Landmark4 eye_drops=new Landmark4("Eye drops","Göz Damlası",R.drawable.eyedrops);
        Landmark4 surgeon=new Landmark4("Surgeon","Cerrah",R.drawable.surgeon);
        Landmark4 physician=new Landmark4("Physician","Hekim",R.drawable.physician);

        landmark4ArrayList.add(plaster);
        landmark4ArrayList.add(bandage);
        landmark4ArrayList.add(stretcher);
        landmark4ArrayList.add(pill);
        landmark4ArrayList.add(ointment);
        landmark4ArrayList.add(ambulance);
        landmark4ArrayList.add(syrup);
        landmark4ArrayList.add(patient);
        landmark4ArrayList.add(dentist);
        landmark4ArrayList.add(nurse);
        landmark4ArrayList.add(hospital);
        landmark4ArrayList.add(eye_drops);
        landmark4ArrayList.add(surgeon);
        landmark4ArrayList.add(physician);

        binding.recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        LandMarkAdapter4 landMarkAdapter4 = new LandMarkAdapter4(landmark4ArrayList);
        binding.recyclerView2.setAdapter(landMarkAdapter4);




    }
}