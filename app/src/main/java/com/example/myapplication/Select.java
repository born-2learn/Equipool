package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Select  extends AppCompatActivity
{
    private Button hospital;
    private Button testingCentre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select);
        hospital = (Button) findViewById(R.id.hospital);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Select.this,Hospital.class);
                startActivity(i);

            }
        });
        testingCentre = (Button) findViewById(R.id.testingCentre);
        testingCentre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Select.this,TestingCentre.class);
                startActivity(i);
            }
        });
    }
}
