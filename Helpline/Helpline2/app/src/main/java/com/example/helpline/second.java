package com.example.helpline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void bakalia(View view) {
        Intent intent = new Intent(this, bakalia.class);
        startActivity(intent);
    }

    public void kotowali(View view) {
        Intent intent = new Intent(this, kotowali.class);
        startActivity(intent);
    }

    public void doublemooring(View view) {
        Intent intent = new Intent(this, doublemooring.class);
        startActivity(intent);
    }

    public void panchlaish(View view) {
        Intent intent = new Intent(this, panchlaish.class);
        startActivity(intent);
    }

    public void chandgaon(View view) {
        Intent intent = new Intent(this, chandgaon.class);
        startActivity(intent);
    }

    public void pahartali(View view) {
        Intent intent = new Intent(this, pahartali.class);
        startActivity(intent);
    }

    public void halisahar(View view) {
        Intent intent = new Intent(this, halisahar.class);
        startActivity(intent);
    }

    public void port(View view) {
        Intent intent = new Intent(this, port.class);
        startActivity(intent);
    }

    public void khulshi(View view) {
        Intent intent = new Intent(this, khulshi.class);
        startActivity(intent);
    }

    public void bayezid(View view) {
        Intent intent = new Intent(this, bayezid.class);
        startActivity(intent);
    }

    public void commissioner(View view) {
        Intent intent = new Intent(this, commissioner.class);
        startActivity(intent);
    }
    }

