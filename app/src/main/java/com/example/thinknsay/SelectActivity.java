package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class SelectActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ImageButton play_butt = findViewById(R.id.butt_play);
        Spinner spinner = findViewById(R.id.spinnerSelectPlayer);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,R.layout.custom_spinner,getResources().getStringArray(R.array.Spinner_items)
        );
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        play_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSelectScreen();
            }
        });

    }
    public void openSelectScreen(){
        Intent intent = new Intent(this, ScreenSelectMode.class);
        startActivity(intent);
    }
}
