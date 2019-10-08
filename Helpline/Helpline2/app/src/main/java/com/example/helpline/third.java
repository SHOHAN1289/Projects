package com.example.helpline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }




    public void chandanpura(View view) {
        Intent intent = new Intent(this, chandpura.class);
        startActivity(intent);
    }


    public void nand(View view) {
        Intent intent = new Intent(this, nand.class);
        startActivity(intent);
    }


    public void lama(View view) {
        Intent intent = new Intent(this, lama.class);
        startActivity(intent);
    }


    public void kalu(View view) {
        Intent intent = new Intent(this, kalur.class);
        startActivity(intent);
    }


    public void bostami(View view) {
        Intent intent = new Intent(this, bostami.class);
        startActivity(intent);
    }


    public void e(View view) {
        Intent intent = new Intent(this, e.class);
        startActivity(intent);
    }

    public void bandar(View view) {
        Intent intent = new Intent(this, bandar.class);
        startActivity(intent);
    }

    public void m(View view) {
        Intent intent = new Intent(this, m.class);
        startActivity(intent);
    }

    public void dewanhut(View view) { Intent intent = new Intent(this, agrabad.class);
        startActivity(intent);
    }
}

