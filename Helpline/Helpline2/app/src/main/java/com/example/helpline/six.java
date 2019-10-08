package com.example.helpline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
    }

    public void alfha(View view) {Intent intent = new Intent(this, alfa.class);
        startActivity(intent);
    }

    public void alif(View view) {Intent intent = new Intent(this, alif.class);
        startActivity(intent);
    }

    public void center(View view) {Intent intent = new Intent(this, center.class);
        startActivity(intent);
    }

    public void health(View view) {Intent intent = new Intent(this, health.class);
        startActivity(intent);
    }

    public void dolphin(View view) {Intent intent = new Intent(this, dolphin.class);
        startActivity(intent);
    }

    public void crecesent(View view) {Intent intent = new Intent(this, cresecent.class);
        startActivity(intent);
    }

    public void media(View view) {Intent intent = new Intent(this, media.class);
        startActivity(intent);
    }

    public void provhati(View view) {Intent intent = new Intent(this, provhati.class);
        startActivity(intent);
    }

    public void surgi(View view) {Intent intent = new Intent(this, surgi.class);
        startActivity(intent);
    }

    public void upasham(View view) {Intent intent = new Intent(this, upasham.class);
        startActivity(intent);
    }
}
