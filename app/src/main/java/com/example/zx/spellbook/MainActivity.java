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


public class MainActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    long timeLeftInMilliseconds = 2400000; //40 minutes

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button00, buttonAddP1, buttonAddP2, buttonSubP1, buttonSubP2,
            buttonHalveP1, buttonHalveP2, buttonC, buttonTimer, reset, testdb, diceroll;
    TextView player1LP, player2LP;
    EditText lpEdit;

    int p1addval, p2addval, p1subval, p2subval;

    boolean isTimerOn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Assigned buttons to IDs*/

        testdb = (Button) findViewById(R.id.testdb);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button00 = (Button) findViewById(R.id.button00);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonAddP1 = (Button) findViewById(R.id.p1add);
        buttonSubP1 = (Button) findViewById(R.id.p1sub);
        buttonHalveP1 = (Button) findViewById(R.id.P1div);
        buttonAddP2 = (Button) findViewById(R.id.P2add);
        buttonSubP2 = (Button) findViewById(R.id.p2sub);
        buttonHalveP2 = (Button) findViewById(R.id.p2div);
        buttonTimer = (Button) findViewById(R.id.timer);
        reset = (Button) findViewById(R.id.reset);
        diceroll = (Button) findViewById(R.id.die_roll);

        lpEdit = (EditText) findViewById(R.id.lpEdit);

        player1LP = (TextView) findViewById(R.id.p1LP);
        player2LP = (TextView) findViewById(R.id.p2LP);


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


        /*Allows the user to add to the current player 1 value*/
        buttonAddP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addP1();
            }
        });

        /*Allows the user to subtract from the current player 1 value*/
        buttonSubP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                subP1();
            }
        });


        /*Allows the user to halve the current player 1 value*/
        buttonHalveP1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (player1LP.getText().equals("1")) {
                    player1LP.setText("1");
                } else {
                    player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) / 2));
                }

            }
        });

        /*Allows the user to add to the current player 2 value*/
        buttonAddP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (String.valueOf(lpEdit.getText()).equals("")){
                    player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) + 0));
                } else {
                    p2addval = Integer.parseInt(String.valueOf(lpEdit.getText()));
                    player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) + p2addval));
                    lpEdit.setText("");
                }
            }
        });

        /*Allows the user to subtract from the current player 2 value*/
        buttonSubP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
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
        });


        /*Allows the user to halve the current player 2 value*/
        buttonHalveP2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (player2LP.getText().equals("1")) {
                    player2LP.setText("1");
                } else {
                    player2LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player2LP.getText())) / 2));
                }

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




    }


    public void dieRoll(){
        Intent intent = new Intent(this, DiceRoll.class);
        startActivity(intent);
    }


    public void openDB(){
        Intent intent = new Intent(this, Database.class);
        startActivity(intent);
    }

    public void addP1() {
        if (String.valueOf(lpEdit.getText()).equals("")){
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) + 0));
        } else {
            p1addval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) + p1addval));
            lpEdit.setText("");
        }
    }

    public void subP1(){
        if (String.valueOf(lpEdit.getText()).equals("")){
            player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) - 0));
        } else {
            p1subval = Integer.parseInt(String.valueOf(lpEdit.getText()));
            if (Integer.parseInt(String.valueOf(player1LP.getText())) - p1subval < 0) {
                player1LP.setText("0");
                lpEdit.setText("");
            } else {
                player1LP.setText(Integer.toString(Integer.parseInt(String.valueOf(player1LP.getText())) - p1subval));
                lpEdit.setText("");
            }
        }
    }


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

        timeLeftText = "" + minutes;
        timeLeftText += ":";
        if (seconds < 10) timeLeftText += 0;
        timeLeftText += seconds;

        buttonTimer.setText(timeLeftText);
    }

    private void reset(){
        AlertDialog.Builder resetAlert = new AlertDialog.Builder(this);
        resetAlert.setMessage("Are you sure you would like to reset?");
        resetAlert.setCancelable(false);

        resetAlert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Resets the game
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
