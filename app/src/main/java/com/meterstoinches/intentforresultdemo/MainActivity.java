package com.meterstoinches.intentforresultdemo;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button click = null;
    public static final int SPY = 5;
    public static final String ACTIVITY1_RESULT = "Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivityForResult(intent, SPY);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == SPY){
            if(resultCode == RESULT_OK){
                Toast.makeText(getApplicationContext(),
                        "You have chosen "+ data.getStringExtra(ACTIVITY1_RESULT),Toast.LENGTH_LONG).show();
            }
        }
    }
}
