package com.example.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;

    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[] {Color.CYAN, Color.RED, Color.BLACK, Color.GRAY, Color.YELLOW, Color.GREEN, Color.BLUE,
        Color.DKGRAY, Color.LTGRAY};

        windowView = findViewById(R.id.windowViewId);

        tryMeButton = findViewById(R.id.tryMeButtonId);
        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int colorsArrayLenght = colors.length;
                Random random = new Random();
                int randomNum = random.nextInt(colorsArrayLenght);

                windowView.setBackgroundColor(colors[randomNum]);

                Log.d("Random", String.valueOf(randomNum));

            }
        });


    }
}
