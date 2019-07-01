package com.meterstoinches.intentforresultdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button intent1 = null;
    private Button intent2 = null;
    Intent result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent1 = (Button) findViewById(R.id.intent1);
        intent2 = (Button) findViewById(R.id.intent2);

        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = new Intent();
                result.putExtra(MainActivity.ACTIVITY1_RESULT,"intent 1");
                setResult(RESULT_OK, result);
                finish();
            }
        });
        intent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = new Intent();
                result.putExtra(MainActivity.ACTIVITY1_RESULT, "intent 2");
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
