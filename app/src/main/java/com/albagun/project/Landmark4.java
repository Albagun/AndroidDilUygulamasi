package com.albagun.project;

import java.io.Serializable;

public class Landmark4 implements Serializable {

    String english;
    String turkish;
    int image;

    public Landmark4(String english,String turkish, int image){
        this.english=english;
        this.turkish=turkish;
        this.image=image;
    }
}
