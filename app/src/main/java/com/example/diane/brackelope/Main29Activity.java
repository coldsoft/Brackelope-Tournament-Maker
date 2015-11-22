package com.example.diane.brackelope;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main29Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);
    }

    public void SelectTeamsForTournament(View view) {
        Intent intent = new Intent(getApplicationContext(), Main210Activity.class); //Application Context and Activity
        startActivityForResult(intent, 0);
    }
}
