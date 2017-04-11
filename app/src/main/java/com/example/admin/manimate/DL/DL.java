package com.example.admin.manimate.DL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.manimate.R;

public class DL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dl);

        final Button button=(Button)findViewById(R.id.Dlviewtask) ;
        final Button button1=(Button)findViewById(R.id.Dlrepprojectstatus) ;
        final Button button2=(Button)findViewById(R.id.DLviewbag) ;
        final Button button3=(Button)findViewById(R.id.DLviewleave) ;
        final Button button4=(Button)findViewById(R.id.DLfaq) ;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn=button.getText().toString();
                if (strbtn.isEmpty()){
                    Toast.makeText(DL.this, "Please wait for Time sheet", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn1=button1.getText().toString();
                if (strbtn1.isEmpty()){
                    Toast.makeText(DL.this, "Please wait for viewjobpost", Toast.LENGTH_SHORT).show();
                    Toast.makeText(DL.this, "Please wait for viewjobpost", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn2=button2.getText().toString();
                if(strbtn2.isEmpty()){
                    Toast.makeText(DL.this, "Please wait for sharejobpost", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn3=button3.getText().toString();
                if (strbtn3.isEmpty()){
                    Toast.makeText(DL.this, "Please Wait for View Leave", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn4=button4.getText().toString();
                if (strbtn4.isEmpty()){
                    Toast.makeText(DL.this, "Please Wait for view payroll", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
