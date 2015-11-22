package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main26Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);
    }

    public void CreateTeam(View view) {
        Intent intent = new Intent(getApplicationContext(), Main25Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }
}
