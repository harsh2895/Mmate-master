package com.example.admin.manimate.HR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.manimate.R;

public class HRviewjobPost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrviewjob_post);

        TextView jobtitle=(TextView)findViewById(R.id.hrpostjobtital);
        TextView jobdesc=(TextView)findViewById(R.id.hrpostjobdec);
        TextView jobaval=(TextView)findViewById(R.id.hrpostjobavlable);
    }
}
