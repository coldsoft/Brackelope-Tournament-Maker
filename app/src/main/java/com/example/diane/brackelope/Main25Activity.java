package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main25Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
    }

    public void AddCreateNewTeam(View view) {
        Intent intent = new Intent(getApplicationContext(), Main26Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void TeamName(View view) {
        Intent intent = new Intent(getApplicationContext(), Main27Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }
}
