package com.example.texttospeech2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    // https://www.tutorialspoint.com/android/android_text_to_speech.htm
    // https://www.tutlane.com/tutorial/android/android-texttospeech-with-examples
    TextToSpeech textToSpeech;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS)
                {
                    int lang = textToSpeech.setLanguage(Locale.CHINESE);
                }
            }
        });


        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textToSpeech.speak("Today is Sunday", TextToSpeech.QUEUE_FLUSH, null);

            }
        });

    }
}