package com.example.zx.spellbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    long timeLeftInMilliseconds = 2400000; //40 minutes

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button00, buttonAddP1, buttonAddP2, buttonSubP1, buttonSubP2,
            buttonHalveP1, buttonHalveP2, buttonC, buttonTimer, reset, testdb, diceroll, coinflip;
    TextView player1LP, player2LP;
    EditText lpEdit;

    int p1addval, p2addval, p1subval, p2subval;

    boolean isTimerOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigned buttons to IDs

        testdb = findViewById(R.id.testdb);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button00 = findViewById(R.id.button00);
        buttonC = findViewById(R.id.buttonC);
        buttonAddP1 = findViewById(R.id.p1add);
        buttonSubP1 = findViewById(R.id.p1sub);
        buttonHalveP1 = findViewById(R.id.P1div);
        buttonAddP2 = findViewById(R.id.P2add);
        buttonSubP2 = findViewById(R.id.p2sub);
        buttonHalveP2 = findViewById(R.id.p2div);
        buttonTimer = findViewById(R.id.timer);
        reset = findViewById(R.id.reset);
        diceroll = findViewById(R.id.die_roll);
        coinflip = findViewById(R.id.coin_flip);

        lpEdit = findViewById(R.id.lpEdit);

        player1LP = findViewById(R.id.p1LP);
        player2LP = findViewById(R.id.p2LP);


        /* Giving buttons their functionality */

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "0");
            }
        });

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText(lpEdit.getText() + "00");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lpEdit.setText("");
            }
        });



        //Allows the user to add to the current player 1 value
        buttonAddP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addP1();
            }
        });

        //Allows the user to subtract from the current player 1 value
        buttonSubP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                subP1();
            }
        });

        //Allows the user to halve the current player 1 value
        buttonHalveP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                halveP1();

            }
        });

        /*Allows the user to add to the current player 2 value*/
        buttonAddP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              addP2();
            }
        });

        /*Allows the user to subtract from the current player 2 value*/
        buttonSubP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                subP2();
            }
        });

        /*Allows the user to halve the current player 2 value*/
        buttonHalveP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                halveP2();
            }
        });

        buttonTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStop();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });


        testdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDB();
            }
        });

        diceroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dieRoll();
            }
        });

        coinflip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();
            }
        });
    }



    //Opens the Die Roll Activity
    public void dieRoll(){
        Intent intent = new Intent(this, DiceRoll.class);
        startActivity(intent);
    }

    //Opens the Coin Flip Activity
    public void flipCoin(){
        Intent intent = new Intent(this, CoinFlip.class);
        startActivity(intent);
    }

    //Opens the Database Activity
    public void openDB(){
        Intent intent = new Intent(this, Database.class);
        startActivity(intent);
    }


    //Goes through the process of adding to Player 1's lifepoints
    public void addP1() {
        //If nothing in the edittext, do nothing
        if (String.valueOf(lpEdit.getText()).equals("")){
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) + 0));
        } else {
            p1addval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) + p1addval));
            lpEdit.setText("");
        }
    }


    //Goes through the process of subtracting to Player 1's lifepoints
    public void subP1(){
        //If nothing in the edittext, do nothing
        if (String.valueOf(lpEdit.getText()).equals("")){
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) - 0));
        } else {
            p1subval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            //If the lifepoints were to go below 0, they will stay at 0
            if (Integer.parseInt(String.valueOf(player1LP.getText())) - p1subval < 0) {
                player1LP.setText("0");
                lpEdit.setText("");
            } else {
                player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) - p1subval));
                lpEdit.setText("");
            }
        }
    }

    //Goes through the process of halving Player 1's lifepoints
    public void halveP1(){
        if (player1LP.getText().equals("1")) {
            player1LP.setText("1");
        } else {
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) / 2));
        }
    }

    //Goes through the process of adding to Player 2's lifepoints
    public void addP2(){
        if (String.valueOf(lpEdit.getText()).equals("")){
            player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) + 0));
        } else {
            p2addval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) + p2addval));
            lpEdit.setText("");
        }
    }

    //Goes through the process of subtracting to Player 2's lifepoints
    public void subP2(){
        if (String.valueOf(lpEdit.getText()).equals("")){
            player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) - 0));
        } else {
            p2subval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            if (Integer.parseInt(String.valueOf(player2LP.getText())) - p2subval < 0) {
                player2LP.setText("0");
                lpEdit.setText("");
            } else {
                player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) - p2subval));
                lpEdit.setText("");
            }
        }
    }

    //Goes through the process of dividing Player 2's lifepoints
    public void halveP2(){
        if (player2LP.getText().equals("1")) {
            player2LP.setText("1");
        } else {
            player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) / 2));
        }
    }


    //Toggles the timer on and off
    public void startStop() {
        if (isTimerOn) {
            stopTimer();
        } else {
            startTimer();
        }
    }


    public void startTimer(){
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
            @Override
            public void onTick(long l) {
                timeLeftInMilliseconds = l;
                updateTimer();

            }

            @Override
            public void onFinish() {

            }
        }.start();

        isTimerOn = true;
    }

    public void stopTimer(){
        countDownTimer.cancel();
        isTimerOn = false;
    }

    public void updateTimer(){
        int minutes = (int) timeLeftInMilliseconds / 60000;
        int seconds = (int) timeLeftInMilliseconds % 60000 / 1000;

        String timeLeftText;

        timeLeftText = "" + minutes; //40 (default)
        timeLeftText += ":"; // :
        if (seconds < 10) timeLeftText += 0; //00-09
        timeLeftText += seconds; //00-59

        buttonTimer.setText(timeLeftText);
    }

    //Resets the main application's variables. Does not affect die roll or coin flip.
    private void reset(){
        AlertDialog.Builder resetAlert = new AlertDialog.Builder(this);
        resetAlert.setMessage("Are you sure you would like to reset?");
        resetAlert.setCancelable(false);

        resetAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Resets the game
                Toast.makeText(getApplicationContext(),"Values reset", Toast.LENGTH_SHORT).show();
                player1LP.setText("8000");
                player2LP.setText("8000");
                if(isTimerOn){
                    stopTimer();
                }
                timeLeftInMilliseconds = 2400000;
                buttonTimer.setText("40:00");
            }
        });

        resetAlert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Do nothing
            }
        });

        resetAlert.create().show();

    }

}
