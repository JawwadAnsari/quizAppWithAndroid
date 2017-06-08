package com.example.vc.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void OnclickPage2(View v)
    {
        RadioButton NS = (RadioButton)findViewById(R.id.radioButton5);
        RadioButton KA = (RadioButton)findViewById(R.id.radioButton6);
        RadioButton IK = (RadioButton)findViewById(R.id.radioButton7);
        RadioButton SA = (RadioButton)findViewById(R.id.radioButton8);
        if (NS.isChecked()) {
            Global.score2 = 0;
        } else if (KA.isChecked()) {
            Global.score2 += 10;
        } else if (IK.isChecked()) {
            Global.score2 = 0;
        } else if (SA.isChecked()) {
            Global.score2 = 0;
        }
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }
}