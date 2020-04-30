package com.example.thinknsay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class PlayScreen extends AppCompatActivity {

    TextView textView;
    private final int REQ_CODE = 100;
    CountDownTimer countDownTimer;
    TextView textTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        //Pause Button
        ImageButton pause_button = findViewById(R.id.butt_pause);
        pause_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseGame();
            }
        });

        //countdown time
        textTime = findViewById(R.id.timer);

        //Tap button to speak
        textView = findViewById(R.id.text);
        ImageButton speak = findViewById(R.id.butt_mic);
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say it!");
                try {
                    startActivityForResult(intent, REQ_CODE);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getApplicationContext(),
                            "Sorry your device not supported",
                            Toast.LENGTH_SHORT).show();
                }
                countDownTimer.start();
            }
        });

        //timer
        countDownTimer = new CountDownTimer(15000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //Toast.makeText(MainActivity.this,"START", Toast.LENGTH_LONG).show();
                textTime.setText(millisUntilFinished/1000+ "s");
            }

            @Override
            public void onFinish() {
                textTime.setText("Time's Up");
                //Toast.makeText(MainActivity.this, "Time's Up", Toast.LENGTH_SHORT).show();
            }
        };


    }

    public void pauseGame(){
        Intent intent = new Intent(this, StopScreen.class);
        startActivity(intent);
    }


}
