package com.example.zx.spellbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button00, buttonAddP1, buttonAddP2, buttonSubP1, buttonSubP2,
            buttonHalveP1, buttonHalveP2, buttonC;
    TextView player1LP, player2LP;
    EditText lpEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Assigned buttons to IDs*/

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




    }
}
