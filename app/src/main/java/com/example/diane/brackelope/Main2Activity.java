package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void CompleteRegistration(View view) {
        Intent intent = new Intent(getApplicationContext(), Main23Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }
}
