package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScreenSelectMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_select_mode);

        Button butt_easy = findViewById(R.id.butt_easy);
        Button butt_medium = findViewById(R.id.butt_medium);
        Button butt_hard = findViewById(R.id.butt_hard);

        butt_easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playEasyMode();
                Toast.makeText(getApplicationContext(), "EASY MODE", Toast.LENGTH_LONG).show();
            }
        });

        butt_medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playMediumMode();
                Toast.makeText(getApplicationContext(), "MEDIUM MODE", Toast.LENGTH_LONG).show();
            }
        });

        butt_hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playHardMode();
                Toast.makeText(getApplicationContext(), "HARD MODE", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void playEasyMode(){
        Intent intent = new Intent(this,PlayScreen.class);
        startActivity(intent);
    }

    public void playMediumMode(){
        Intent intent = new Intent(this,PlayScreen.class);
        startActivity(intent);
    }

    public void playHardMode(){
        Intent intent = new Intent(this,PlayScreen.class);
        startActivity(intent);
    }
}
