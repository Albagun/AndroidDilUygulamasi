package com.albagun.project;

import java.io.Serializable;

public class LandMark implements Serializable {
    String english;
    String turkish;
    int image;
    //constructor
    public LandMark(String english,String turkish, int image){
        this.english=english;
        this.turkish=turkish;
        this.image=image;
    }
}
