package com.example.shingut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "VideoActivity";
    private VideoView mVideoview;
    ImageButton b1,b2,b3,b4,home;
    View.OnClickListener cl;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home= (ImageButton) findViewById(R.id.home);
        b1 = (ImageButton) findViewById(R.id.button1);
        b2 = (ImageButton) findViewById(R.id.button2);
        b3 = (ImageButton) findViewById(R.id.button3);
        b4 = (ImageButton) findViewById(R.id.button4);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch ( v.getId() ) {
                    case R.id.button1 :
                        i = new Intent(getApplicationContext(), smart.class);
                        startActivity(i);
                        break;
                    case R.id.button2 :
                        i = new Intent(getApplicationContext(), guide.class);
                        startActivity(i);
                        break;
                    case R.id.button3 :
                        i = new Intent(getApplicationContext(), event.class);
                        startActivity(i);
                        break;
                    case R.id.button4 :
                        i = new Intent(getApplicationContext(), map.class);
                        startActivity(i);
                        break;
                    case R.id.home :
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        break;
                }
            }
        };
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mVideoview = (VideoView) findViewById(R.id.videoview);
        //play video
        mVideoview.setVideoURI( Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));
        mVideoview.start();
        //loop
        mVideoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }
}