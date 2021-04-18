package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TextView_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.TextView_1 = findViewById(R.id.textView_1);
    }

    public void OnButtonclick(View view) {
        this.TextView_1.setText("You've change the text!");
    }

    public void OnButtonclick_2(View view) {
        this.TextView_1.setTextColor(0xFF00FF00);
    }

}