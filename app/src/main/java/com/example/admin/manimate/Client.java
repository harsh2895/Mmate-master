package com.example.admin.manimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Client extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);
        final Button button=(Button)findViewById(R.id.CLtimesheet) ;
        final Button button1=(Button)findViewById(R.id.CLprojectstatus) ;
        final Button button2=(Button)findViewById(R.id.Clpostbag) ;
        final Button button3=(Button)findViewById(R.id.CLfaq) ;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn=button.getText().toString();
                if (strbtn.isEmpty()){
                    Toast.makeText(Client.this, "Please wait for Time sheet", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn1=button1.getText().toString();
                if (strbtn1.isEmpty()){
                    Toast.makeText(Client.this, "Please wait for viewjobpost", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn2=button2.getText().toString();
                if(strbtn2.isEmpty()){
                    Toast.makeText(Client.this, "Please wait for sharejobpost", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn3=button3.getText().toString();
                if (strbtn3.isEmpty()){
                    Toast.makeText(Client.this, "Please Wait for View Leave", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
