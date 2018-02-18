package com.example.android.labbaika_1202152330;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splashScreen extends AppCompatActivity {
    private static int SPLASH = 3000; //deklarasi waktu splash 3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() { //Handler Splash Screen
            @Override
            public void run() {
                Intent intent = new Intent(splashScreen.this, chooseOrder.class); //splash
                startActivity(intent); //start splash screen
                finish(); //close splash activity
            }
        }, SPLASH); //waktu splash screen

        Toast.makeText(this, "LABBAIKA PUTRI TIOVANI_12O2152330", 1).show(); //munculkan toast

    }
}
