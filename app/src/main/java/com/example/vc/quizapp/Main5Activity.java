package com.example.vc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void OnclickPage5(View v)
    {
        RadioButton SMK = (RadioButton) findViewById(R.id.radioButton17);
        RadioButton NA = (RadioButton) findViewById(R.id.radioButton18);
        RadioButton II = (RadioButton) findViewById(R.id.radioButton19);
        RadioButton SM = (RadioButton) findViewById(R.id.radioButton20);

        if (SMK.isChecked()) {
            Global.score5 = 0;
        } else if (NA.isChecked()) {
            Global.score5 += 10;
        } else if (II.isChecked()) {
            Global.score5 = 0;
        } else if (SM.isChecked()) {
            Global.score5 = 0;
        }
        Intent intent = new Intent(Main5Activity.this, Result.class);
        startActivity(intent);
    }
}
