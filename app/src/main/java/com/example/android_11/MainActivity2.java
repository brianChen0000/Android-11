package com.example.android_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "3a713219";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button3 = (Button) findViewById(R.id.button2);
        button3.setOnClickListener((v) -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
        Log.d(TAG, "The activity state---->onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "The activity state---->onStart");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "The activity state---->onRestart");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "The activity state---->onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "The activity state---->onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "The activity state---->onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "The activity state---->onDestroy");
    }
}