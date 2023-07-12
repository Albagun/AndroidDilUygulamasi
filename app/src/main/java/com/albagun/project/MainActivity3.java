package com.albagun.project;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


public class MainActivity3 extends AppCompatActivity {

    EditText inputToTranslate;
    Button mSpeakBtn, mStopBtn;

    TextToSpeech mTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        inputToTranslate = findViewById(R.id.inputToTranslate);
        mSpeakBtn = findViewById(R.id.mSpeakBtn);
        mStopBtn = findViewById(R.id.mStopBtn);

       mTTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR){
                    mTTS.setLanguage(Locale.ENGLISH);
                }
                else {
                    Toast.makeText(MainActivity3.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        },"com.google.android.tts");


        mSpeakBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String toSpeak = inputToTranslate.getText().toString().trim();
                if (toSpeak.equals("")){

                    Toast.makeText(MainActivity3.this, "Metin girin...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity3.this, toSpeak, Toast.LENGTH_SHORT).show();
                    mTTS.setSpeechRate(1.f);
                    mTTS.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null, null);
                }
            }
        });


        mStopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTTS.isSpeaking()){
                    mTTS.stop();
                    //mTTS.shutdown();
                }
                else {

                    Toast.makeText(MainActivity3.this, "Konuşma yok", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        if (mTTS != null || mTTS.isSpeaking()){

            mTTS.stop();

        }
        super.onPause();
    }
}
class Translator {

    Button translateButton;

    public static void main(String[] args) throws IOException {
        String text = "Hello world!";
        //Translated text: Hallo Welt!
        System.out.println("Translated text: " + translate("tr", "en", text));
    }

    private static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        String urlStr = "https://script.google.com/d/12N0UUAnEw2roZ2Ao5vOe6PbX9-6AcPYgvET2Vh5XWUDj2K26sj_t99Zz/edit?usp=sharing" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

}