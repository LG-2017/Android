package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private TextView numberTextView;
    private Button PlusButton;
    private Button MinusButton;
    private Button ResetButton;
    private Button NextActivityButton;
    private Button ExitButton;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        SetListeners();

    }
    private void init(){
        numberTextView = findViewById(R.id.numberTextview);
        PlusButton = findViewById(R.id.Plusbutton);
        MinusButton = findViewById(R.id.Minusbutton);
        ResetButton = findViewById(R.id.Resetbutton);
        NextActivityButton = findViewById(R.id.nextactivitybutton);
        ExitButton = findViewById(R.id.exitbutton);
    }
    private void SetListeners() {
        numberTextView.setText(String.valueOf(num));
        PlusButton.setOnClickListener(view -> {
            num++;
            numberTextView.setText(String.valueOf(num));
        });
        MinusButton.setOnClickListener(view -> {
            num--;
            numberTextView.setText(String.valueOf(num));
        });
        ResetButton.setOnClickListener(view -> {
            num = 0;
            numberTextView.setText(String.valueOf(num));
        });
        NextActivityButton.setOnClickListener(view -> {
            Intent secondActivityIntent = new Intent(this,MainActivity2.class);
            startActivity(secondActivityIntent);
        });
        ExitButton.setOnClickListener(view -> {
            this.finish();
        });
    }
}