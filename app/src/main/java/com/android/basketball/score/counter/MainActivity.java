package com.android.basketball.score.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.basketball.score.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void freeThrowTeamA(View view) {
        scoreTeamA++;
        TextView scoreTeamATextView = findViewById(R.id.scoreTeamA);
        scoreTeamATextView.setText(""+scoreTeamA);
    }

    public void plus2_teamA(View view) {
        scoreTeamA = scoreTeamA+2;
        TextView scoreTeamATextView = findViewById(R.id.scoreTeamA);
        scoreTeamATextView.setText(""+scoreTeamA);
    }

    public void plus3_teamA(View view) {
        scoreTeamA = scoreTeamA+3;
        TextView scoreTeamATextView = findViewById(R.id.scoreTeamA);
        scoreTeamATextView.setText(""+scoreTeamA);
    }

    public void plus3_teamB(View view) {
        scoreTeamB = scoreTeamB+3;
        TextView scoreTeamBTextView = findViewById(R.id.scoreTeamB);
        scoreTeamBTextView.setText(""+scoreTeamB);
    }

    public void plus2_teamB(View view) {
        scoreTeamB = scoreTeamB+2;
        TextView scoreTeamBTextView = findViewById(R.id.scoreTeamB);
        scoreTeamBTextView.setText(""+scoreTeamB);
    }

    public void freeThrowTeamB(View view) {
        scoreTeamB++;
        TextView scoreTeamBTextView = findViewById(R.id.scoreTeamB);
        scoreTeamBTextView.setText(""+scoreTeamB);
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        TextView scoreTeamBTextView = findViewById(R.id.scoreTeamB);
        scoreTeamBTextView.setText(""+scoreTeamB);
        TextView scoreTeamATextView = findViewById(R.id.scoreTeamA);
        scoreTeamATextView.setText(""+scoreTeamA);
    }
}
