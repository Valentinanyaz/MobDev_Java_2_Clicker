package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button reduceBtn;
    Button deleteBtn;

    private int score = 0;
    //private int score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);
        mainBtn = (Button) findViewById(R.id.mainBtn);
        reduceBtn = (Button) findViewById(R.id.reduceBtn);
        deleteBtn = (Button) findViewById(R.id.deleteBtn);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                if (score == 1)
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if (score == 2)
                {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if (score == 3)
                {
                    String s = "Кнопка нажата " + score +  " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if  (score == 4)
                {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                }

            }
        };

        mainBtn.setOnClickListener(clickListener);

        View.OnClickListener clickListener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                if (score == 1)
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if (score == 2)
                {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if (score == 3)
                {
                    String s = "Кнопка нажата " + score +  " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else if  (score == 4)
                {
                    String s = "Кнопка нажата " + score + " раза";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
                else
                {
                    String s = "Кнопка нажата " + score + " раз";
                    mainText.setText(s.toCharArray(),0, s.length());
                }
            }
        };

        reduceBtn.setOnClickListener(clickListener1);

        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainText.setText("Hello world");


            }
        };

        deleteBtn.setOnClickListener(clickListener2);
    }
}

