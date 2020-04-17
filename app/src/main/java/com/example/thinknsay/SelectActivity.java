package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ImageButton backward_button = findViewById(R.id.button_backward);
        ImageButton forward_button = findViewById(R.id.button_forward);

        backward_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeScreen();
            }
        });

        forward_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayScreen();
            }
        });
    }

    public void openHomeScreen(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void openPlayScreen(){
        Intent intent = new Intent(this,SelectCategoryScreen.class);
        startActivity(intent);
    }
}
