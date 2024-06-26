package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = findViewById(R.id.rv_guest);
        rv.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        rv.setLayoutManager(layoutManager);

        GuestAdapter adapter = new GuestAdapter();
        rv.setAdapter(adapter);

        //


    }
}