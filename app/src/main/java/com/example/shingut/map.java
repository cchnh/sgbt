package com.example.shingut;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

import com.example.shingut.R;

public class map extends MainActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tool_bar);
        toolbar = (Toolbar) findViewById(R.id.toolbar);


    }
}