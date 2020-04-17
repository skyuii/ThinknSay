package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_button = findViewById(R.id.start_button);
        Button score_button = findViewById(R.id.score_button);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectScreen();
            }
        });
        score_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScoreScreen();
            }
        });
    }

    public void openSelectScreen(){
        Intent intent = new Intent(this, SelectActivity.class);
        startActivity(intent);
    }
    public void openScoreScreen(){
        Intent intent = new Intent(this, ScoreScreen.class);
        startActivity(intent);
    }
}
