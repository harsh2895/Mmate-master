package com.example.admin.manimate.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.R;

import static com.example.admin.manimate.R.id.Clprojectname;

public class CLpostbag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clpostbag);

        final EditText ed1 = (EditText) findViewById(Clprojectname);
        final EditText ed2 = (EditText) findViewById(R.id.ClBagtitle);
        final EditText ed3 = (EditText) findViewById(R.id.ClBagdec);
        Button button = (Button) findViewById(R.id.BtBagPost);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String JobTitle = ed1.getText().toString();
                String JobDec = ed2.getText().toString();
                String JobAvavi = ed3.getText().toString();

                if (JobTitle.isEmpty()) {
                    Toast.makeText(CLpostbag.this, "Project Title can't be empty", Toast.LENGTH_SHORT).show();
                } else if (JobDec.isEmpty()) {
                    Toast.makeText(CLpostbag.this, "Bag Title can't be empty", Toast.LENGTH_SHORT).show();

                } else if (JobAvavi.isEmpty()) {
                    Toast.makeText(CLpostbag.this, "Bag Descpritio can't be empty", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
