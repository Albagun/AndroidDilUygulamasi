package com.albagun.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick3(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity5.class);
        startActivity(intent);
    }
    public void onClick4(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity6.class);
        startActivity(intent);
    }
    public void onClick5(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity7.class);
        startActivity(intent);
    }
    public void onClick6(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity8.class);
        startActivity(intent);
    }
    public void onClick7(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity9.class);
        startActivity(intent);
    }
    public void onClick8(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity10.class);
        startActivity(intent);
    }
    public void onClick9(View view){
        Intent intent= new Intent(MainActivity2.this, MainActivity11.class);
        startActivity(intent);
    }

}