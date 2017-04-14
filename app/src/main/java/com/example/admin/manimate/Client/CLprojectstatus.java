package com.example.admin.manimate.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.manimate.R;

public class CLprojectstatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clprojectstatus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        TextView protitle=(TextView)findViewById(R.id.CLPROJECTtitle);
        TextView jobdesc=(TextView)findViewById(R.id.CLPROJECTstatus);
        TextView jobaval=(TextView)findViewById(R.id.CLPROJECTdisc);
    }
}
