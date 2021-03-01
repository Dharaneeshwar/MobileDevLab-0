package com.example.testapplicationforcollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebURL() {
        String url = "https://rmd.ac.in/";
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( url ) );
        startActivity( browse );
    }
}