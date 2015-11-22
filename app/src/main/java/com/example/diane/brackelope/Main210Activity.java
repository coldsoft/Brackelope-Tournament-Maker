package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main210Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main210);
    }

    public void TeamName2(View view) {
        Intent intent = new Intent(getApplicationContext(), Main27Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

}
