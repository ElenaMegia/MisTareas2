package com.example.mistareas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaTareas = (ListView) findViewById(R.id.listaTareas);
        Bundle bundle = getIntent().getExtras();

    }
}