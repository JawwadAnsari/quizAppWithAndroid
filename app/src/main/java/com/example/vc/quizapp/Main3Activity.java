package com.example.vc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void OnclickPage3(View v)
    {
        RadioButton PM = (RadioButton) findViewById(R.id.radioButton9);
        RadioButton JB = (RadioButton) findViewById(R.id.radioButton10);
        RadioButton BA = (RadioButton) findViewById(R.id.radioButton11);
        RadioButton APQ = (RadioButton) findViewById(R.id.radioButton12);

        if (PM.isChecked()) {
            Global.score3 = 0;
        } else if (JB.isChecked()) {
            Global.score3 += 10;
        } else if (BA.isChecked()) {
            Global.score3 = 0;
        } else if (APQ.isChecked()) {
            Global.score3 = 0;
        }
        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
        startActivity(intent);
    }
}
