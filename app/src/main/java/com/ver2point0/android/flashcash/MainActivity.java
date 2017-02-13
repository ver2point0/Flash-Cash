package com.ver2point0.android.flashcash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int blueScore = 2000;
    int redScore = 2000;
    int greenScore = 2000;
    int bankScore = 90000;
    String dollarSign = "$";
    int noMoney = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // BLUE TEAM METHODS

    /**
     * Decrease the score for the blue team 50 points.
     */
    public void minusFiftyBlue(View v) {
        if (blueScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.blue_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiftyBank();
        blueScore -= 50;
        displayForBlue(blueScore);
    }

    /**
     * Increase the score for the blue team 50 points.
     */
    public void addFiftyBlue(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiftyBank();
        blueScore += 50;
        displayForBlue(blueScore);
    }

    /**
     * Decrease the score for the blue team 200 points.
     */
    public void minusTwoHundredBlue(View v) {
        if (blueScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.blue_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addTwoHundredBank();
        blueScore -= 200;
        displayForBlue(blueScore);
    }

    /**
     * Increase the score for the blue team 200 points.
     */
    public void addTwoHundredBlue(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusTwoHundredBank();
        blueScore += 200;
        displayForBlue(blueScore);
    }

    /**
     * Decrease the score for the blue team 500 points.
     */
    public void minusFiveHundredBlue(View v) {
        if (blueScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.blue_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiveHundredBank();
        blueScore -= 500;
        displayForBlue(blueScore);
    }

    /**
     * Increase the score for the blue team 500 points.
     */
    public void addFiveHundredBlue(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiveHundredBank();
        blueScore += 500;
        displayForBlue(blueScore);
    }

    /**
     * Displays the given score for the blue team.
     */
    public void displayForBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_team_score);
        if (scoreView != null) {
            scoreView.setText(dollarSign + score);
        }
    }

    // RED TEAM METHODS

    /**
     * Decrease the score for the red team 50 points.
     */
    public void minusFiftyRed(View v) {
        if (redScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.red_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiftyBank();
        redScore -= 50;
        displayForRed(redScore);
    }

    /**
     * Increase the score for the red team 50 points.
     */
    public void addFiftyRed(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiftyBank();
        redScore += 50;
        displayForRed(redScore);
    }

    /**
     * Decrease the score for the red team 200 points.
     */
    public void minusTwoHundredRed(View v) {
        if (redScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.red_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addTwoHundredBank();
        redScore -= 200;
        displayForRed(redScore);
    }

    /**
     * Increase the score for the red team 200 points.
     */
    public void addTwoHundredRed(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusTwoHundredBank();
        redScore += 200;
        displayForRed(redScore);
    }

    /**
     * Decrease the score for the red team 500 points.
     */
    public void minusFiveHundredRed(View v) {
        if (redScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.red_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiveHundredBank();
        redScore -= 500;
        displayForRed(redScore);
    }

    /**
     * Increase the score for the red team 500 points.
     */
    public void addFiveHundredRed(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiveHundredBank();
        redScore += 500;
        displayForRed(redScore);
    }

    /**
     * Displays the given score for the red team.
     */
    public void displayForRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_team_score);
        if (scoreView != null) {
            scoreView.setText(dollarSign + score);
        }
    }

    // GREEN TEAM METHODS

    /**
     * Decrease the score for the green team 50 points.
     */
    public void minusFiftyGreen(View v) {
        if (greenScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.green_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiftyBank();
        greenScore -= 50;
        displayForGreen(greenScore);
    }

    /**
     * Increase the score for the green team 50 points.
     */
    public void addFiftyGreen(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiftyBank();
        greenScore += 50;
        displayForGreen(greenScore);
    }

    /**
     * Decrease the score for the green team 200 points.
     */
    public void minusTwoHundredGreen(View v) {
        if (greenScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.green_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addTwoHundredBank();
        greenScore -= 200;
        displayForGreen(greenScore);
    }

    /**
     * Increase the score for the green team 200 points.
     */
    public void addTwoHundredGreen(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusTwoHundredBank();
        greenScore += 200;
        displayForGreen(greenScore);
    }

    /**
     * Decrease the score for the green team 500 points.
     */
    public void minusFiveHundredGreen(View v) {
        if (greenScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.green_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        addFiveHundredBank();
        greenScore -= 500;
        displayForGreen(greenScore);
    }

    /**
     * Increase the score for the green team 500 points.
     */
    public void addFiveHundredGreen(View v) {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        minusFiveHundredBank();
        greenScore += 500;
        displayForGreen(greenScore);
    }

    /**
     * Displays the given score for the green team.
     */
    public void displayForGreen(int score) {
        TextView scoreView = (TextView) findViewById(R.id.green_team_score);
        if (scoreView != null) {
            scoreView.setText(dollarSign + score);
        }
    }

    // BANK METHODS

    /**
     * Decrease the score for the bank 50 points.
     */
    public void minusFiftyBank() {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        bankScore -= 50;
        displayForBank(bankScore);
    }

    /**
     * Increase the score for the bank 50 points.
     */
    public void addFiftyBank() {
        bankScore += 50;
        displayForBank(bankScore);
    }

    /**
     * Decrease the score for the bank 200 points.
     */
    public void minusTwoHundredBank() {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        bankScore -= 200;
        displayForBank(bankScore);
    }

    /**
     * Increase the score for the bank 200 points.
     */
    public void addTwoHundredBank() {
        bankScore += 200;
        displayForBank(bankScore);
    }

    /**
     * Decrease the score for the bank 500 points.
     */
    public void minusFiveHundredBank() {
        if (bankScore == noMoney) {
            Toast.makeText(getApplicationContext(), R.string.bank_no_money, Toast.LENGTH_SHORT).show();
            return;
        }
        bankScore -= 500;
        displayForBank(bankScore);
    }

    /**
     * Increase the score for the bank 500 points.
     */
    public void addFiveHundredBank() {
        bankScore += 500;
        displayForBank(bankScore);
    }

    /**
     * Displays the given score for the bank.
     */
    public void displayForBank(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bank_score);
        if (scoreView != null) {
            scoreView.setText(dollarSign + score);
        }
    }

    /**
     * Reset all scores.
     */
    public void resetAllScores(View v) {
        blueScore = 2000;
        redScore = 2000;
        greenScore = 2000;
        bankScore = 90000;
        displayForBlue(blueScore);
        displayForRed(redScore);
        displayForGreen(greenScore);
        displayForBank(bankScore);
    }
}
