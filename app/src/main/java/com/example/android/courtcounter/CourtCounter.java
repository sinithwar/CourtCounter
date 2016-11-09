package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CourtCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court_counter);
    }
    // This is the global variable that represents the overall count
    private int shotCount = 0;
    // Add Three adds 3 to the overall count
    public void addThree(View view){
        this.shotCount += 3;
        displayForTeamA(this.shotCount);
    }
    //Add Two adds 2 to the overall count
    public void addTwo(View view){
        this.shotCount += 2;
        displayForTeamA(this.shotCount);
    }
    // Free throw adds 1 to the overall count
    public void freeThrow(View view){
        this.shotCount += 1;
        displayForTeamA(this.shotCount);
    }
    // Reset changes the score back to zero
    public void resetScore(View view){
        this.shotCount = 0;
        displayForTeamA(this.shotCount);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }
}
