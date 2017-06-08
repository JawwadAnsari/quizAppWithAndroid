package com.example.vc.quizapp;

import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }

    public void onClick(View v){
        EditText res = (EditText) findViewById(R.id.editText);

        Global.result = Global.score+Global.score2+Global.score3+Global.score4+Global.score5;
        res.setText("You got "+(Integer.toString(Global.result))+" Marks");
    }
}

