package com.example.zx.spellbook;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class DiceRoll extends Activity {
     ImageView imageViewDice;
     Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        setContentView(R.layout.activity_diceroll);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                Toast.makeText(getApplicationContext(),"You rolled a 1!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                Toast.makeText(getApplicationContext(),"You rolled a 2!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                Toast.makeText(getApplicationContext(),"You rolled a 3!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                Toast.makeText(getApplicationContext(),"You rolled a 4!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                Toast.makeText(getApplicationContext(),"You rolled a 5!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                Toast.makeText(getApplicationContext(),"You rolled a 6!", Toast.LENGTH_SHORT).show();
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
