package com.example.vc.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnclickPage1(View v)
    {
        RadioButton Khi = (RadioButton) findViewById(R.id.radioButton);
        RadioButton Isl = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton Pes = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton Lhr = (RadioButton) findViewById(R.id.radioButton4);

        if (Khi.isChecked()) {
            Global.score = 0;
        } else if (Isl.isChecked()) {
            Global.score += 10;
        } else if (Pes.isChecked()) {
            Global.score = 0;
        } else if (Lhr.isChecked()) {
            Global.score = 0;
        }
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}