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

    private AdapterView adapterView;
    Spinner spinnerSelect;
    int currentItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        spinnerSelect = (Spinner)findViewById(R.id.spinnerSelectPlayer);

        spinnerSelect.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(currentItem == position){
                    return;
                }else{
                    Intent intent = new Intent(SelectActivity.this, ScreenSelectMode.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
