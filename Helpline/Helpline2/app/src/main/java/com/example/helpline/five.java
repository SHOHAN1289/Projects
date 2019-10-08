package com.example.helpline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }

    public void cscr(View view) {
        Intent intent = new Intent(this, cscr.class);
        startActivity(intent);
    }

    public void ma(View view) {
        Intent intent = new Intent(this, maoshishu.class);
        startActivity(intent);
    }

    public void al(View view) {
        Intent intent = new Intent(this, al.class);
        startActivity(intent);
    }

    public void ustc(View view) {
        Intent intent = new Intent(this, ustc.class);
        startActivity(intent);
    }

    public void metro(View view) {
        Intent intent = new Intent(this, metro.class);
        startActivity(intent);
    }

    public void diabetic(View view) {
        Intent intent = new Intent(this, diabetic.class);
        startActivity(intent);
    }

    public void general(View view) {
        Intent intent = new Intent(this, general1.class);
        startActivity(intent);
    }

    public void ctgmedical(View view) {
        Intent intent = new Intent(this, ctgmedical.class);
        startActivity(intent);
    }

    public void poly(View view) {
        Intent intent = new Intent(this, poly.class);
        startActivity(intent);
    }

    public void cmh(View view) {
        Intent intent = new Intent(this, cmh.class);
        startActivity(intent);
    }

    public void desh(View view) {
        Intent intent = new Intent(this, desh.class);
        startActivity(intent);
    }



    public void hali(View view) {
        Intent intent = new Intent(this, hali.class);
        startActivity(intent);
    }

    public void holy(View view) {
        Intent intent = new Intent(this, holy.class);
        startActivity(intent);
    }

    public void lion(View view) {
        Intent intent = new Intent(this, lion.class);
        startActivity(intent);
    }

    public void moni(View view) {
        Intent intent = new Intent(this, moni.class);
        startActivity(intent);
    }

    public void national(View view) {
        Intent intent = new Intent(this, national.class);
        startActivity(intent);
    }

    public void max(View view) {
        Intent intent = new Intent(this, max.class);
        startActivity(intent);
    }
}
