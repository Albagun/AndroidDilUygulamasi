package com.albagun.project;

import java.io.Serializable;

public class Landmark5 implements Serializable {
    String english;
    String turkish;
    int image;

    public Landmark5(String english,String turkish, int image){
        this.english=english;
        this.turkish=turkish;
        this.image=image;
    }
}
