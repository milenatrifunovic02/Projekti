package com.example.igramemorije;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Win extends AppCompatActivity {
    private Button restart, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Intent intent = getIntent();
        int score = intent.getIntExtra(Game.SCORE, 0);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText("Vaš rezultat:\n" + score);


        restart = findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });
        exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomePage();
                finish();
            }
        });
    }

    public void openGame(){
        Intent intent = new Intent(Win.this, Game.class);
        startActivity(intent);
    }

    public void openHomePage(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}