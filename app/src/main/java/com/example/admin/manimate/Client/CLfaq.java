package com.example.admin.manimate.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.manimate.R;

public class CLfaq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clfaq);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
    }
}
