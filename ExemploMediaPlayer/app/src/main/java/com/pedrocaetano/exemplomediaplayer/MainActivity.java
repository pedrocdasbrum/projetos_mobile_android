package com.pedrocaetano.exemplomediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer a1;

    private Button btP1;
    private Button btP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchReferences();
        playAudios();

        a1 = MediaPlayer.create(MainActivity.this,R.raw.metal);
        a1.start();

        a1 = MediaPlayer.create(MainActivity.this,R.raw.faustao);
        a1.start();
    }

    public void onStop() {
        if(a1.isPlaying()) {
            a1.stop();
        }
        super.onStop();
    }

    public void searchReferences() {
        btP1 = (Button) findViewById(R.id.btP1);
        btP2 = (Button) findViewById(R.id.btP2);
    }

    public void playAudios() {
        btP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1.start();
            }
        });
    }
}