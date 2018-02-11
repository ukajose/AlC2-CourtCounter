package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   int scoreVariable = 0 ;
    int scoreVariable2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void submitA(View view) {

        scoreVariable = scoreVariable + 3;
       displayForTeamA(scoreVariable);
    }

    /**
     * Displays the given score for Team A.
     */
    public void submitB(View view)
    {
        scoreVariable = scoreVariable + 2;
        displayForTeamA(scoreVariable);
    }
    /**
     * Displays the given score for Team A.
     */
    public void freethrows(View view)
    {
        scoreVariable = scoreVariable + 1;
        displayForTeamA(scoreVariable);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submitC(View view){
        scoreVariable2  = scoreVariable2 + 3;
        displayForTeamB(scoreVariable2);
    }

    public void submitD(View view){
        scoreVariable2 = scoreVariable2 + 2;
        displayForTeamB(scoreVariable2);
    }
    public void freethrows2(View view){
        scoreVariable2 = scoreVariable2 + 1;
        displayForTeamB(scoreVariable2);
    }

    public void reset(View view){
        scoreVariable = 0;
        displayForTeamA(scoreVariable);
        scoreVariable2  = 0;
        displayForTeamB(scoreVariable2);
    }
}
