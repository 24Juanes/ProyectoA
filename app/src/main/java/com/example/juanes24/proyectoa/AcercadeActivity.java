package com.example.juanes24.proyectoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcercadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    public void Volverclicked(View view) {
        Intent i= new Intent(AcercadeActivity.this, SplashActivity.class);
        startActivity(i);
    }
}
