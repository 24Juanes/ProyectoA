package com.example.juanes24.proyectoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.mConexión) {
            Intent intent= new Intent (SplashActivity.this,ConexionActivity.class);
            startActivity(intent);


        }else{
            Intent intent= new Intent (SplashActivity.this,AcercadeActivity.class);
            startActivity(intent);

        }


        return super.onOptionsItemSelected(item);

    }
}
