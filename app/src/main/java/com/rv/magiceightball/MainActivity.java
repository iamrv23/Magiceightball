package com.rv.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int [] ball = {R.drawable.magic_eight_ball_yes, R.drawable.magic_eight_ball_no, R.drawable.magic_eight_ball_doubt, R.drawable.magic_eight_ball_noidea};
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.magic_ball);
    }

    public void askMe(View view) {

        Random random = new Random();
        int randomNo = random.nextInt(4);

        iv.animate().rotation(360).setDuration(360);

        iv.setImageResource(ball[randomNo]);


    }
}
