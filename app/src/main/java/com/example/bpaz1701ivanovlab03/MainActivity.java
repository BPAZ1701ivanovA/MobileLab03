package com.example.bpaz1701ivanovlab03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView tv_proba;
    private TextView tv_result;
    private String phase_gened;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Забор текста из генератора.
        phase_gened = Phaser.PhaserGen();
        //Инициализация (иначе злой краш).
        tv_proba = (TextView) findViewById(R.id.tv_proba);
        tv_proba.setText("Всё, что вам нужно - это " + phase_gened);
        //Пункт 6.
        tv_result = (TextView) findViewById(R.id.tv_result);
        String s = tv_proba.getText().toString();;
        String[] split = s.split(" - это ");
        String firstSubString = split[0];
        String secondSubString = split[1];
        tv_result.setText(secondSubString + " - это " + firstSubString);
    }
    public void onButtonClick(View v)
    {
        phase_gened = Phaser.PhaserGen();
        tv_proba = (TextView) findViewById(R.id.tv_proba);
        tv_proba.setText("Всё, что вам нужно - это " + phase_gened);
        //Пункт 6.
        tv_result = (TextView) findViewById(R.id.tv_result);
        String s = tv_proba.getText().toString();;
        String[] split = s.split(" - это ");
        String firstSubString = split[0];
        String secondSubString = split[1];
        tv_result.setText(secondSubString + " - это " + firstSubString);
    }
}
