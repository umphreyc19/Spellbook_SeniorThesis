package com.example.zx.spellbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, button00, buttonAddP1, buttonAddP2, buttonSubP1, buttonSubP2,
            buttonHalveP1, buttonHalveP2, buttonC;
    EditText player1LP, player2LP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1LP = (EditText) findViewById(R.id.player1LP);
        player2LP = (EditText) findViewById(R.id.player2LP);

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



    }
}
