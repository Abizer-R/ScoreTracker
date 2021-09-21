package com.example.scoretracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore () {
        TextView teamAScore = findViewById(R.id.scoreTeamATxtView);
        TextView teamBScore = findViewById(R.id.scoreTeamBTxtView);
        teamAScore.setText("" + scoreTeamA);
        teamBScore.setText("" + scoreTeamB);
    }

    public void add3ForTeamA (View view) {
        scoreTeamA += 3;
        displayScore();
    }

    public void add2ForTeamA (View view) {
        scoreTeamA += 2;
        displayScore();
    }

    public void add1ForTeamA (View view) {
        scoreTeamA += 1;
        displayScore();
    }

    public void add3ForTeamB (View view) {
        scoreTeamB += 3;
        displayScore();
    }

    public void add2ForTeamB (View view) {
        scoreTeamB += 2;
        displayScore();
    }

    public void add1ForTeamB (View view) {
        scoreTeamB += 1;
        displayScore();
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScore();
    }
}