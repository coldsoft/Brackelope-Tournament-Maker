package com.example.diane.brackelope;

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

    public void Register(View view) {
        Intent intent = new Intent(getApplicationContext(), Main2Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void HelpAndContactUs(View view) {
        Intent intent = new Intent(getApplicationContext(), Main24Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void Arrow(View view) {
        Intent intent = new Intent(getApplicationContext(), Main23Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

}
