package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenSelectMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_select_mode);

        Button butt_easym = findViewById(R.id.butt_easy);
        Button butt_mediumm = findViewById(R.id.butt_medium);
        Button butt_hardm = findViewById(R.id.butt_hard);

        butt_easym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playEasyMode();
            }
        });

        butt_mediumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMediumMode();
            }
        });

        butt_mediumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHardMode();
            }
        });

    }

    public void playEasyMode(){

    }

    public void playMediumMode(){

    }

    public void playHardMode(){

    }
}
