package com.moinonemoi.recyclerviewstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moinonemoi.recyclerviewstudy.gift.GiftActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txtViewHello);
        button1 = findViewById(R.id.buttonClickOnMe);
        button2 = findViewById(R.id.button_second_page);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(R.string.text_how_are_you);
                button1.setVisibility(View.GONE);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GiftActivity.class);
                startActivity(intent);
            }
        });
    }
}