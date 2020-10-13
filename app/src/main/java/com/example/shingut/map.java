package com.example.shingut;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

public class map extends MainActivity {
    Toolbar toolbar;
    ImageButton home;
    View.OnClickListener cl;
    Intent i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        home = (ImageButton) findViewById(R.id.home);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch ( v.getId() ) {
                    case R.id.home :
                        i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        break;
                }
            }
        };
        home.setOnClickListener(cl);



    }
}