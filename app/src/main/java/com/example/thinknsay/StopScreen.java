package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StopScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_screen);

        Button resume_button = findViewById(R.id.butt_resume);
        Button restart_button = findViewById(R.id.butt_restart);
        Button menu_button = findViewById(R.id.butt_menu);

        resume_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumePlayScreen();
            }
        });

        restart_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToStart();
            }
        });

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMenu();
            }
        });
    }

    public void resumePlayScreen(){
        Intent intent = new Intent(this, PlayScreen.class);
        startActivity(intent);
    }

    public void backToStart(){
        Intent intent = new Intent(this, SelectActivity.class);
        startActivity(intent);
    }

    public void backToMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
