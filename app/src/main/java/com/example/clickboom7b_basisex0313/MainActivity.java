package com.example.clickboom7b_basisex0313;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int sumclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        sumclick = 0;
    }

    public void clicking(View view) {
        sumclick = sumclick + 1;
        if (sumclick%7==0) {
            btn.setText("This is a click number:" + "BOOM!");
        }
        else {
            btn.setText("This is a click number:" + sumclick);
        }
    }
}