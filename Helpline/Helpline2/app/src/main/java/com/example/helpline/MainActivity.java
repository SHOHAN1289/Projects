package com.example.helpline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void POLICE(View view) {
        Intent intent = new Intent(this, second.class);
        startActivity(intent);
    }

    public void fireservice(View view) {
        Intent intent = new Intent(this, third.class);
        startActivity(intent);

    }

    public void rab(View view) {
        Intent intent = new Intent(this, four.class);
        startActivity(intent);
    }

    public void hospital(View view) {
        Intent intent = new Intent(this, five.class);
        startActivity(intent);
    }

    public void ambulance(View view) {
        Intent intent = new Intent(this, six.class);
        startActivity(intent);

    }
}

