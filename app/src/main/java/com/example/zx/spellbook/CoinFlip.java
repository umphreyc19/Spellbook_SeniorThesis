package com.example.zx.spellbook;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class CoinFlip extends Activity {
    public static final Random rand = new Random();
    private ImageView coin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_coinflip);
        coin = findViewById(R.id.coin);
        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flipCoin();
            }
        });
    }

    //Determines which side of the coin to be on (flips the coin)
    private void flipCoin(){
        coin.setImageResource(rand.nextFloat() > 0.5f ? R.drawable.tails : R.drawable.heads);
    }


}
