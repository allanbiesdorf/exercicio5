package com.example.Exercicio_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button startButton;
    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startButton);
        counterText = findViewById(R.id.counterText);

        startButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Counter counter = new Counter(startButton, counterText);
        counter.execute(10);
    }
}