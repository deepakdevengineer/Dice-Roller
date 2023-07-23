package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView diceSide1, diceSide2, diceSide3;
    private TextView resultTextView;
    private Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diceSide1 = findViewById(R.id.diceSide1);
        diceSide2 = findViewById(R.id.diceSide2);
        diceSide3 = findViewById(R.id.diceSide3);
        resultTextView = findViewById(R.id.resultTextView);
        rollButton = findViewById(R.id.rollButton);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        Random random = new Random();
        int side1 = random.nextInt(6) + 1; // Generates a random number from 1 to 6
        int side2 = random.nextInt(5) + 1;
        int side3 = random.nextInt(6) + 1;

        diceSide1.setText(String.valueOf(side1));
        diceSide2.setText(String.valueOf(side2));
        diceSide3.setText(String.valueOf(side3));

        // Find the maximum number
        int maxNumber = Math.max(side1, Math.max(side2, side3));

        // Highlight the TextView with the maximum number
//        highlightMaxSide(maxNumber);

        // Show the greater value in the resultTextView
        resultTextView.setText("The greatest Slide value is: " + maxNumber);
    }
//
//    private void highlightMaxSide(int maxNumber) {
//        diceSide1.setBackgroundResource(android.R.color.transparent);
//        diceSide2.setBackgroundResource(android.R.color.transparent);
//        diceSide3.setBackgroundResource(android.R.color.transparent);
//
//        if (maxNumber == Integer.parseInt(diceSide1.getText().toString())) {
//            diceSide1.setBackgroundResource(R.color.highlightColor);
//        } else if (maxNumber == Integer.parseInt(diceSide2.getText().toString())) {
//            diceSide2.setBackgroundResource(R.color.highlightColor);
//        } else if (maxNumber == Integer.parseInt(diceSide3.getText().toString())) {
//            diceSide3.setBackgroundResource(R.color.highlightColor);

    }

