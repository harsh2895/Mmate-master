package com.example.admin.manimate.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.R;

import static com.example.admin.manimate.R.id.ClProjectTitle;

public class CLuploadproject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluploadproject);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final EditText ed1 = (EditText) findViewById(ClProjectTitle);
        final EditText ed2 = (EditText) findViewById(R.id.ClprojectDec);
        final EditText ed3 = (EditText) findViewById(R.id.CLprojectDure);
        Button button = (Button) findViewById(R.id.BtUploadpro);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String JobTitle = ed1.getText().toString();
                String JobDec = ed2.getText().toString();
                String JobAvavi = ed3.getText().toString();

                if (JobTitle.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Project Title can't be empty", Toast.LENGTH_SHORT).show();
                } else if (JobDec.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Bag Descpritio can't be empty", Toast.LENGTH_SHORT).show();

                } else if (JobAvavi.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Project Duretion can't be empty", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
