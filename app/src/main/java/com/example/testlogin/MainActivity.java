package com.example.testlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a delay of 2 seconds (2000 milliseconds)
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, login1.class);
                startActivity(intent);
            }
        });

//        int delayMillis = 5000;
//        // Create an Intent
//        final Intent intent = new Intent(MainActivity.this, Login.class);
        // Use a Handler to post the Intent with a delay
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(intent);
//            }
//        }, delayMillis);
//    }
    }
}