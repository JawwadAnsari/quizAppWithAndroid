package com.example.vc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void OnclickPage4(View v)
    {
        RadioButton Y = (RadioButton) findViewById(R.id.radioButton13);
        RadioButton P = (RadioButton) findViewById(R.id.radioButton14);
        RadioButton D = (RadioButton) findViewById(R.id.radioButton15);
        RadioButton RU = (RadioButton) findViewById(R.id.radioButton16);

        if (Y.isChecked()) {
            Global.score4 = 0;
        } else if (P.isChecked()) {
            Global.score4 += 10;
        } else if (D.isChecked()) {
            Global.score4 = 0;
        } else if (RU.isChecked()) {
            Global.score4 = 0;
        }
        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
        startActivity(intent);
    }
}
