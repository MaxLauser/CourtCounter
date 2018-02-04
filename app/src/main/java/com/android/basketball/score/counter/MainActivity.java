package com.android.basketball.score.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.basketball.score.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foolTeamA = 0;
    int scoreTeamB = 0;
    int foolTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void freeThrowTeamA(View view) {

        scoreTeamA += 1;
        displayScoreForTeamA();
    }

    public void plus2_teamA(View view) {

        scoreTeamA += 2;
        displayScoreForTeamA();
    }

    public void plus3_teamA(View view) {

        scoreTeamA += 3;
        displayScoreForTeamA();
    }

    public void plus3_teamB(View view) {

        scoreTeamB += 3;
        displayScoreForTeamB();
    }

    public void plus2_teamB(View view) {

        scoreTeamB += 2;
        displayScoreForTeamB();
    }

    public void freeThrowTeamB(View view) {

        scoreTeamB += 1;
        displayScoreForTeamB();

    }

    public void resetScore(View view) {

        scoreTeamA = 0;
        foolTeamA = 0;
        scoreTeamB = 0;
        foolTeamB = 0;
        displayScoreForTeamA();
        displayScoreForTeamB();
        displayFoulsForTeamA();
        displayFoulsForTeamB();

    }

    public void foolTeamA(View view) {

        foolTeamA += 1;
        displayFoulsForTeamA();

    }

    public void foolTeamB(View view) {

        foolTeamB += 1;
        displayFoulsForTeamB();

    }
    public void displayScoreForTeamA(){

        TextView scoreTeamATextView = findViewById(R.id.scoreTeamA);
        scoreTeamATextView.setText(""+scoreTeamA);

    }
    public void displayScoreForTeamB(){

        TextView scoreTeamBTextView = findViewById(R.id.scoreTeamB);
        scoreTeamBTextView.setText(""+scoreTeamB);

    }
    public void displayFoulsForTeamA(){

        TextView foulTeamATextView = findViewById(R.id.foulsTeamA);
        foulTeamATextView.setText(""+foolTeamA);

    }
    public void displayFoulsForTeamB(){

        TextView foulTeamBTextView = findViewById(R.id.foulsTeamB);
        foulTeamBTextView.setText(""+foolTeamB);

    }
}
