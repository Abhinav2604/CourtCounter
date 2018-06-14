package com.example.abhinavkumarsingh.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusTwo(View view) {
        score += 2;
        displayForTeamA(score);
    }

    public void plusThree(View view) {
        score += 3;
        displayForTeamA(score);
    }

    public void plusOne(View view) {
        score += 1;
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusTwoB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void plusThreeB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void plusOneB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void reset(View view) {
        score = 0;
        scoreB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }

}
