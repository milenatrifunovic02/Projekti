package com.example.igramemorije;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import android.os.Handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game extends AppCompatActivity {
    private Button win;
    private List<ImageButton> imageButtons = new ArrayList<>();
    private List<Integer> cardFlips = new ArrayList<>();
    private int firstCardIndex = -1;
    private int secondCardIndex = -1;
    private List<Integer> imageIds;
    private int pairsFound = 0;
    private int totalPairs = 8;
    private int score = 20;
    public static final String SCORE = "com.example.igramemorije.SCORE";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        imageIds = new ArrayList<>(Arrays.asList(
                R.drawable.haku, R.drawable.catbus, R.drawable.howls, R.drawable.kiki,
                R.drawable.mouse, R.drawable.noface, R.drawable.ponyo, R.drawable.totoro
        ));
//
        imageIds.addAll(imageIds);

        Collections.shuffle(imageIds);

        for (int i = 0; i < 16; i++) {
            String buttonId = "imageButton" + (i + 1);
            int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
            imageButtons.add(findViewById(resId));

            final int index = i;
            imageButtons.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCardClick(index);
                }
            });
        }

        for (int i = 0; i < 16; i++) {
            imageButtons.get(i).setImageResource(R.drawable.bgcard);
        }

        for (int i = 0; i < 16; i++) {
            cardFlips.add(0);
        }

        win = findViewById(R.id.win);
        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWinActivity();
                finish();
            }
        });
    }

    private void onCardClick(int index) {
        if (cardFlips.get(index) == 0) {
            imageButtons.get(index).setImageResource(imageIds.get(index));
            cardFlips.set(index, 1);

            if (firstCardIndex == -1) {
                firstCardIndex = index;
            } else {
                secondCardIndex = index;

                if (imageIds.get(firstCardIndex).equals(imageIds.get(secondCardIndex))) {
                    cardFlips.set(firstCardIndex, 2);
                    cardFlips.set(secondCardIndex, 2);

                    score +=5;

                    firstCardIndex = -1;
                    secondCardIndex = -1;
                } else {
                    score-=2;

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            resetCards();

                            firstCardIndex = -1;
                            secondCardIndex = -1;
                        }
                    }, 400);
                }
            }
            if (cardFlips.get(index) == 2) {
               pairsFound++;
            }
            if (pairsFound == totalPairs) {
                win.setVisibility(View.VISIBLE);
            }
        }
    }

    private void resetCards() {
        imageButtons.get(firstCardIndex).setImageResource(R.drawable.bgcard);
        imageButtons.get(secondCardIndex).setImageResource(R.drawable.bgcard);
        cardFlips.set(firstCardIndex, 0);
        cardFlips.set(secondCardIndex, 0);
    }

    public void openWinActivity(){
        Intent intent = new Intent(this, Win.class);
        intent.putExtra(SCORE, score);
        startActivity(intent);
        finish();
    }
}
