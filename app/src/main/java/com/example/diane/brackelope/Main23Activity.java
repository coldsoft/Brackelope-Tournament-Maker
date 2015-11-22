package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
    }

    public void Name(View view) {
        Intent intent = new Intent(getApplicationContext(), Main22Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void Tournament(View view) {
        Intent intent = new Intent(getApplicationContext(), Main29Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void Teams(View view) {
        Intent intent = new Intent(getApplicationContext(), Main25Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void PastTournaments(View view) {
        Intent intent = new Intent(getApplicationContext(), Main28Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }

    public void HelpAndContactUs2(View view) {
        Intent intent = new Intent(getApplicationContext(), Main24Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }
}
