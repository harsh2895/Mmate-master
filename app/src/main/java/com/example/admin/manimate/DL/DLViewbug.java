package com.example.admin.manimate.DL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.manimate.R;

public class DLViewbug extends AppCompatActivity {

    String[] bagArray ={"Project Name","Bug Title","Discription"};

    static class ViewListHolder{

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlviewbug);

        ArrayAdapter adapter =new ArrayAdapter<String>(this,R.layout.activity_dlviewbug,bagArray);

        ListView listView =(ListView) findViewById(R.id.LvDLViewbag);
        listView.setAdapter(adapter);

    }
}
