package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    TextView reduceText;
    Button mainBtn;
    Button reduceBtn;

    private int score = 0;
    private int score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.mainBtn);
        reduceText = (TextView) findViewById(R.id.reduceText);
        reduceBtn = (Button) findViewById(R.id.reduceBtn);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "Кликов: " + score;
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score1 --;
                String r = "Кликов: " + score1;
                reduceText.setText(r.toCharArray(),0,r.length());
            }
        };

        reduceBtn.setOnClickListener(clickListener1);
    }
}

